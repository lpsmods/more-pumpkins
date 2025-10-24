# Generate all textures
from PIL import Image, ImageFile, ImageColor
import glob
import json
import os


def process_image(image: ImageFile.ImageFile, colors):
    img = image.copy()
    pixels = img.load()
    width, height = img.size

    for x in range(width):
        for y in range(height):
            size = len(colors)
            # red
            if pixels[x, y] == (255, 0, 0, 255):
                pixels[x, y] = colors[0] if size >= 1 else (0, 0, 0)

            # green
            if pixels[x, y] == (0, 255, 0, 255):
                pixels[x, y] = colors[1] if size >= 2 else (0, 0, 0)

            # blue
            if pixels[x, y] == (0, 0, 255, 255):
                pixels[x, y] = colors[2] if size >= 3 else (0, 0, 0)

    return img


def build(output, subfolders=True):
    os.makedirs(output, exist_ok=True)

    patterns = glob.glob("src/patterns/*.png")
    with open("variants.json") as fd:
        variants = json.load(fd)

    # red
    # green
    # blue
    for pattern in patterns:
        tex = Image.open(pattern).convert("RGBA")

        for variant in variants:
            base = Image.open(os.path.join('src', variant['base'])).convert("RGBA")
            name = os.path.basename(os.path.splitext(pattern)[0])
            if variant["name"] in ["carved", "jack_o_lantern"] and name == "default":
                print("SKIP")
                continue

            dir = os.path.join(output, variant["name"]) if subfolders else output
            os.makedirs(dir, exist_ok=True)
            fp = os.path.join(
                dir, variant["filename"].replace("NAME", name).replace("default_", "")
            )

            print(fp)

            colors = []
            if "colors" in variant:
                colors = [ImageColor.getrgb(color) for color in variant["colors"]]

            overlay = process_image(tex, colors)
            res = Image.alpha_composite(base, overlay)
            res.save(fp)


build("resource_packs/more_pumpkins/textures/lpsm/more_pumpkins/blocks", True)
