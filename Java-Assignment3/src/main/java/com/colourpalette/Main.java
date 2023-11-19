package com.colourpalette;

public class Main {
    public static void main(String[] args) {
        // Example usage of ColourTable
        ColourTable colourTable = new ColourTable(16); // Change the palette size as needed

        // Add Colours
        colourTable.add(0xFF0000); // Red
        colourTable.add(0x00FF00); // Green
        colourTable.add(0xFFD700); // Gold
        colourTable.add(0x9932CC); // Dark Orchid
        colourTable.add(0xE6E6FA); // Lavender
        colourTable.add(0xFA8072); // Salmon
        colourTable.add(0x87CEEB); // Sky Blue
        colourTable.add(0x808000); // Olive
        colourTable.add(0xFF6347); // Tomato
        colourTable.add(0x2F4F4F); // Dark Slate Gray
        colourTable.add(0x9370DB); // Medium Purple
        colourTable.add(0x00CED1); // Dark Turquoise
        colourTable.add(0xA52A2A); // Brown
        colourTable.add(0xFFA500); // Orange
        colourTable.add(0x00CED1); // Cyan




        // Try adding an invalid RGB color
        try {
            colourTable.add(0x123456); // Invalid RGB color
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Print some information about the ColourTable
        System.out.println("Palette Size: " + colourTable.getPaletteSize());
        System.out.println("Number of Colors in Palette: " + colourTable.getNumberOfColors());
    }
}

