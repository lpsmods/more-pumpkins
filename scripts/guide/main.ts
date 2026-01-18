import { Icon, Pages } from "@lpsmods/mc-utils";
import { blocks } from "./blocks";
import { changelogs } from "./changelogs";
import { items } from "./items";

export const pages: Pages = {
  home: {
    title: "guide.common.guide_book",
    body: "#desc",
    buttons: ["blocks", "items", "creator", "changelogs"],
  },
  creator: {
    title: "#creator",
    icon: Icon.Comment,
    body: "#creator.desc",
  },
  ...blocks,
  ...items,
  ...changelogs,
};
