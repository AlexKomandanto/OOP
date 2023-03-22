package lesson2.HW2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Building building = new Building(100);
        Character character = new Character(100, 0);

        Random rand = new Random();
        while (building.getLife() > 0 && character.getLife() > 0) {
            if (rand.nextBoolean()) {
                // attack the building
                int damage = rand.nextInt(10) + 1;
                building = new Building(building.getLife() - damage);
                Render.displayStatus(building);
            } else {
                // attack the character
                int damage = rand.nextInt(10) + 1;
                character = new Character(character.getLife() - damage, character.getFatigue() + 5);
                Render.displayStatus(character);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

