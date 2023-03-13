package ru.gb.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Homework {

    public static void main(String[] args) {
        // 1. Создать класс Player с полями id (long), name (String), damage (double) healthPoint (hp) (double)
        // У класса должен быть конструктор, который принимает только name.
        // Идентификатор присваивается автоматически из последовательности (1, 2, ...)
        // Каждый класс должен уметь "бить" другого Player'а
        // void attack(Player player) -> player1.attack(player2)
        // Внутри метода игрок, на котором вызван метод уменьшает здоровье игрока, который передан в метод
        // Придумать несколько классов с разными параметрами жизней и атаки по-умолчанию
        // Player player = new Tank("name");
        // 2. * Придумать, все, что захочется и обогатить проект
        // 3. Понасоздавать объектов и стравить их друг с другом

        Player player1 = new Player("Player", 15); // 15
        Player player2 = new ExtPlayer("ExtPlayer"); // 20

        player1.attack(player2);

        List<Player> players = new ArrayList<>(); // 10

        for (Player player : players) {
            for (Player another : players) {
                if (player.equals(another)) {
                    continue;
                }

                player.attack(another);
            }
        }

//        while (true) {
//            Player randomPlayer1 = players.get(ThreadLocalRandom.current().nextInt(10));
//            Player randomPlayer2 = players.get(ThreadLocalRandom.current().nextInt(10));
//            randomPlayer1.attack(randomPlayer2);
//        }

    }

    static class Player {

        private String name;
        private int damage;
        private int hp;

        public Player(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attack(Player another) {

        }

    }

    static class ExtPlayer extends Player {

        public ExtPlayer(String name) {
            super(name, 20);
        }



    }

}
