import { world } from "@minecraft/server";
import { connect } from "@lpsmods/mcaddon-bridge";

function worldLoad() {
  // Connect to the api
  connect("lpsm_more_pumpkins").then((myPack) => {
    if (!myPack) return;

    // Register recipe
    const recipe = {
        name: "wiki:test",
        group: 'custom',
        convert: "c.is_pale ? 'diorite' : 'stone'"
    };
    myPack.call(world, "register_carving_knife_recipe", recipe);
  });
}

world.afterEvents.worldLoad.subscribe(worldLoad);
