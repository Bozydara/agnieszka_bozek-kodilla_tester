package com.kodilla;

public class ColoursApplication {
    public static void main(String[] args) {
        ColoursDecode coloursDecode = new ColoursDecode();
        String colourName = coloursDecode.showColourName().toLowerCase();
        System.out.println(colourName);
    }
}