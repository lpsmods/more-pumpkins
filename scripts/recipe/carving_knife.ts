import { object, optional, string } from "superstruct";
import patterns from "../../patterns.json";

export const carvingKnifeRecipes = patterns;

export interface CarvingKnifeRecipe {
  name: string;
  convert: string;
  group?: string;
}

export const carvingKnifeRecipeStruct = object({
  name: string(),
  convert: string(),
  group: optional(string()),
});
