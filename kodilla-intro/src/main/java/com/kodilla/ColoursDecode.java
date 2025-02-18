package com.kodilla;

public class ColoursDecode {
    public String showColourName() {
        String userReply = UserInteraction.getFirstLetterOfColour();
        return switch(userReply) {
            case "B" -> Colours.BLUE.name();
            case "R" -> Colours.RED.name();
            case "O" -> Colours.ORANGE.name();
            case "Y" -> Colours.YELLOW.name();
            case "G" -> Colours.GREEN.name();
            case "P" -> Colours.PINK.name();
            case "W" -> Colours.WHITE.name();
            default ->  "we don't know the colour beginning with such a letter, please try one more time :)";
        };
    }
}