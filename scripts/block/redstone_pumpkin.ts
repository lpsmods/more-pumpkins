import { BlockBaseComponent, BlockUtils, NeighborUpdateEvent } from "@lpsmods/mc-utils";
import {
  BlockComponentOnPlaceEvent,
  BlockComponentTickEvent,
  BlockCustomComponent,
  CustomComponentParameters,
} from "@minecraft/server";
import { BlockStateSuperset } from "@minecraft/vanilla-data";
import { create, defaulted, object, string, Struct } from "superstruct";
import { PROJECT_ID } from "../constants";

export interface RedstoneJackOLanternOptions {
  lit_state: keyof BlockStateSuperset;
}

export class RedstoneJackOLantern extends BlockBaseComponent implements BlockCustomComponent {
  static readonly componentId = `${PROJECT_ID}:redstone_jack_o_lantern`;

  struct: Struct<any, any> = object({
    lit_state: defaulted(string(), `${PROJECT_ID}:lit`),
  });

  constructor() {
    super();
    this.onTick = this.onTick.bind(this);
    this.onPlace = this.onPlace.bind(this);
  }

  onPlace(event: BlockComponentOnPlaceEvent, args: CustomComponentParameters): void {
    this.basePlace(event, args);
  }

  onTick(event: BlockComponentTickEvent, args: CustomComponentParameters): void {
    this.baseTick(event, args);
  }

  onNeighborUpdate(event: NeighborUpdateEvent, args: CustomComponentParameters): void {
    const options = create(args.params, this.struct) as RedstoneJackOLanternOptions;
    const level = event.sourceBlock.getRedstonePower();
    if (level === undefined) return;
    BlockUtils.setState(event.block, options.lit_state, level > 0);
  }
}
