package com.colourpalette;

import java.util.ArrayList;
import java.util.List;

public class ColourTable {
    private final int paletteSize;
    private final List<Integer> palette;

    public ColourTable(int paletteSize) {
        if (!isValidPaletteSize(paletteSize)) {
            throw new IllegalArgumentException("Invalid palette size. Must be a power of two and between 2 and 1024.");
        }
        this.paletteSize = paletteSize;
        this.palette = new ArrayList<>(paletteSize);
    }

    public void add(int rgbColor) {
        if (palette.size() >= paletteSize) {
            throw new IllegalStateException("Exceeded the capacity of the ColourTable.");
        }

        // Validate RGB color
        if (!isValidRGB(rgbColor)) {
            throw new IllegalArgumentException("Invalid RGB color value.");
        }

        // Add the RGB color to the palette
        palette.add(rgbColor);
    }

    public int getPaletteSize() {
        return paletteSize;
    }

    public int getNumberOfColors() {
        return palette.size();
    }

    private boolean isValidRGB(int rgbColor) {
        // Check if the RGB color is a valid 24-bit value
        int red = (rgbColor >> 16) & 0xFF;
        int green = (rgbColor >> 8) & 0xFF;
        int blue = rgbColor & 0xFF;

        return red >= 0 && red <= 255 && green >= 0 && green <= 255 && blue >= 0 && blue <= 255;
    }

    private boolean isValidPaletteSize(int size) {
        return size > 1 && (size & (size - 1)) == 0 && size < 1025;
    }
}

