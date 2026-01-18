import { world } from "@minecraft/server";
import { Bridge } from "@lpsmods/mcaddon-bridge";
import { CarvingKnifeRecipe, carvingKnifeRecipeStruct, carvingKnifeRecipes } from "./recipe/carving_knife";

const api = new Bridge("lpsm_more_pumpkins");

api.defineProperty(world, "register_carving_knife_recipe", {
  value: function (recipe: CarvingKnifeRecipe) {
    carvingKnifeRecipes.push(carvingKnifeRecipeStruct.create(recipe));
  },
  writeable: true,
  enumerable: true,
  configurable: true,
});
