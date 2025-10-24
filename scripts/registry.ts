import { BlockComponentRegistry, ItemComponentRegistry } from "@minecraft/server";
import { GuideBookComponent, AddonUtils, shearableBlocks } from "@lpsmods/mc-utils";
import { pages } from "./guide/main";
import { CarvingKnifeComponent } from "./item/carving_knife";
import { RedstoneJackOLantern } from "./block/redstone_pumpkin";
import { PROJECT_ID } from "./constants";

// Shears
shearableBlocks.register(`${PROJECT_ID}:pale_pumpkin`, { block: `${PROJECT_ID}:pale_carved_pumpkin` });

export function registerItemComponents(reg: ItemComponentRegistry): void {
  reg.registerCustomComponent(AddonUtils.makeId("guide_book"), new GuideBookComponent(pages));
  GuideBookComponent.setup(AddonUtils.makeId("guide_book"));
  reg.registerCustomComponent(CarvingKnifeComponent.componentId, new CarvingKnifeComponent());
}

export function registerBlockComponents(reg: BlockComponentRegistry): void {
  reg.registerCustomComponent(RedstoneJackOLantern.componentId, new RedstoneJackOLantern());
}
