package org.example.lesson1.HW01;

public class Main {
        public static void main(String[] args) {
            Player player1 = new Tank("Tanker");
            Player player2 = new Assassin("Assassin");
            Player player3 = new Mage("Mage");

            while (player1.isAlive() && player2.isAlive()) {
                player1.attack(player2);
                System.out.printf("%s - Нанес урон: %f,  игроку %s \n\n", player1.getName(),
                        player1.getDamage(),player2.getName());
                if (player2.isAlive()) {
                    player2.attack(player1);
                    System.out.printf("%s - Нанес урон: %f,  игроку %s \n\n", player2.getName(),
                            player2.getDamage(),player1.getName());
                }
            }

            if (player1.isAlive()) {
                System.out.println(player1.getName() + " wins!");
            } else {
                System.out.println(player2.getName() + " wins!");
            }

            while (player3.isAlive() && player2.isAlive()) {
                player3.attack(player2);
                System.out.printf("%s - Нанес урон: %f,  игроку %s \n\n", player3.getName(),
                        player3.getDamage(),player2.getName());
                if (player2.isAlive()) {
                    player2.attack(player3);
                    System.out.printf("%s - Нанес урон: %f,  игроку %s \n\n", player2.getName(),
                            player2.getDamage(),player3.getName());
                }
            }

            if (player3.isAlive()) {
                System.out.println(player3.getName() + " wins!");
            } else {
                System.out.println(player2.getName() + " wins!");
            }
        }

}
