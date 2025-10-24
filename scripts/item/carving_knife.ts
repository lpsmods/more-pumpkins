import {
  ItemComponentUseEvent,
  CustomComponentParameters,
  EquipmentSlot,
  EntityHitBlockAfterEvent,
  ItemStack,
  BlockPermutation,
  ItemCustomComponent,
  world,
  Direction,
} from "@minecraft/server";
import {
  ActionForm,
  ActionFormHandler,
  ItemUtils,
  ItemBaseComponent,
  AddonUtils,
  BlockUtils,
  MolangUtils,
  WorldUtils,
} from "@lpsmods/mc-utils";

import { PROJECT_ID } from "../constants";
import patterns from "../../patterns.json";

interface CarvingPattern {
  name: string;
  convert: string;
  group?: string;
}

export type patternMap = { [key: string]: string };

export class CarvingKnifeComponent extends ItemBaseComponent implements ItemCustomComponent {
  static readonly componentId = `${PROJECT_ID}:carving_knife`;
  static instance: CarvingKnifeComponent | undefined = undefined;

  constructor() {
    super();
    this.onUse = this.onUse.bind(this);
    CarvingKnifeComponent.instance = this;
  }

  getPattern(patternName: string): CarvingPattern | undefined {
    return patterns.find((p: CarvingPattern) => p.name === patternName);
  }

  onCarve(event: EntityHitBlockAfterEvent, itemStack: ItemStack): void {
    const dim = event.damagingEntity.dimension;
    const isPale = event.hitBlock.typeId.includes("pale_");
    const patId = (itemStack.getDynamicProperty(AddonUtils.makeId("pattern")) as string) ?? "default";
    if (!BlockUtils.matchAny(event.hitBlock, ["pumpkin", AddonUtils.makeId("pale_pumpkin")])) return;
    const pattern = this.getPattern(patId);
    if (!pattern) return;
    const blockId = MolangUtils.block(event.hitBlock, pattern.convert, {
      context: { is_pale: isPale },
    }) as string;
    let dir = WorldUtils.rot2dir(event.damagingEntity.getRotation());
    if (dir === Direction.Down || dir === Direction.Up) dir = Direction.North;
    const perm = BlockPermutation.resolve(blockId, {
      "minecraft:cardinal_direction": WorldUtils.getOpposite(dir).toLowerCase(),
    });
    event.hitBlock.setPermutation(perm);
    const loot = isPale ? "pale_pumpkin" : "pumpkin";
    const { x, y, z } = event.hitBlock.location;
    dim.runCommand(`loot spawn ${x} ${y} ${z} loot "loot_tables/lpsm/more_pumpkins/carve/${loot}.json"`);
    dim.playSound("pumpkin.carve", event.hitBlock.location);
    ItemUtils.applyDamage(event.damagingEntity, itemStack);
  }

  onUse(event: ItemComponentUseEvent, args: CustomComponentParameters): void {
    if (!event.itemStack) return;
    const selected = (event.itemStack.getDynamicProperty(AddonUtils.makeId("pattern")) as string) ?? "default";
    const form: ActionForm = {
      title: "menu.carving_knife.title",
      body: {
        rawtext: [
          {
            translate: "menu.carving_knife.desc",
            with: {
              rawtext: [{ translate: `menu.carving_knife.pattern.${selected}` }],
            },
          },
        ],
      },
      buttons: [],
    };

    const changePattern = (pattern: string) => {
      if (!event.itemStack) return;
      event.itemStack.setDynamicProperty(AddonUtils.makeId("pattern"), pattern);
      ItemUtils.setStack(event.source, EquipmentSlot.Mainhand, event.itemStack);
    };

    if (form.buttons) {
      const groups: { [key: string]: CarvingPattern[] } = {};
      for (const pattern of patterns) {
        if (pattern.group) {
          if (!(pattern.group in groups)) groups[pattern.group] = [];
          groups[pattern.group].push(pattern);
          continue;
        }

        form.buttons.push({
          icon: `textures/lpsm/more_pumpkins/ui/patterns/${pattern.name}.png`,
          label: `menu.carving_knife.pattern.${pattern.name}`,
          onClick() {
            changePattern(pattern.name);
          },
        });
      }

      for (const [group, patterns] of Object.entries(groups)) {
        form.buttons.unshift({
          icon: `textures/lpsm/more_pumpkins/ui/patterns/${patterns[0].name}.png`,
          label: `menu.carving_knife.group.${group}`,
          onClick(cEvent) {
            const form: ActionForm = {
              title: `menu.carving_knife.group.${group}`,
              body: {
                rawtext: [
                  {
                    translate: "menu.carving_knife.desc",
                    with: {
                      rawtext: [{ translate: `menu.carving_knife.pattern.${selected}` }],
                    },
                  },
                ],
              },
              buttons: patterns.map((p) => {
                return {
                  icon: `textures/lpsm/more_pumpkins/ui/patterns/${p.name}.png`,
                  label: `menu.carving_knife.pattern.${p.name}`,
                  onClick() {
                    changePattern(p.name);
                  },
                };
              }),
            };
            const ui = new ActionFormHandler(form);
            ui.show(event.source);
          },
        });
      }
    }

    const ui = new ActionFormHandler(form);
    ui.show(event.source);
  }
}

function setup() {
  world.afterEvents.entityHitBlock.subscribe((event: EntityHitBlockAfterEvent) => {
    const stack = event.damagingEntity.getComponent("equippable")?.getEquipment(EquipmentSlot.Mainhand);
    const com = CarvingKnifeComponent.instance;
    if (!stack?.getComponent(CarvingKnifeComponent.componentId) || !com) return;
    com.onCarve(event, stack);
  });
}

setup();
