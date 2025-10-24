import { AddonUtils } from "@lpsmods/mc-utils";
import { PROJECT_ID } from "./constants";

AddonUtils.addonId = PROJECT_ID;

import { StartupEvent, system, world } from "@minecraft/server";
import { registerItemComponents, registerBlockComponents } from "./registry";

function startup(event: StartupEvent): void {
  registerItemComponents(event.itemComponentRegistry);
  registerBlockComponents(event.blockComponentRegistry);
}

system.beforeEvents.startup.subscribe(startup);
