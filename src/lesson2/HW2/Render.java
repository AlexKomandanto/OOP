package lesson2.HW2;

public class Render {

    public static void displayStatus(Object object) {
        if (object instanceof HasHealthPoint) {
            HasHealthPoint hasHealthPoint = (HasHealthPoint) object;
            String life = "Life: " + hasHealthPoint.getLife() + "%";
            System.out.println(getColoredText(life, hasHealthPoint.getLife()));
        }
        if (object instanceof Tiredness) {
            Tiredness tiredness = (Tiredness) object;
            String fatigue = "Fatigue: " + tiredness.getFatigue() + "%";
            System.out.println(getColoredText(fatigue, tiredness.getFatigue()));
        }
    }

    private static String getColoredText(String text, int value) {
        String colorCode;
        if (value <= 24) {
            colorCode = "\u001B[31m"; //red
        } else if (value > 24 && value <= 50) {
            colorCode = "\u001B[33m"; //yellow
        } else {
            colorCode = "\u001B[32m"; //green
        }
        return colorCode + text + "\u001B[0m";
    }
}


