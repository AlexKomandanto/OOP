package org.example.lesson1.HW01;

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

public class Player {
    private static long count = 0; // to generate unique ids for each player
    private final long id;
    private final String name;
    private double damage;
    private double healthPoints;

    public Player(String name) {
        this.id = ++count;
        this.name = name;
        this.damage = 10.0; // default damage
        this.healthPoints = 100.0; // default health points
    }

    public void attack(Player player) {
        player.reduceHealthPoints(this.damage);
    }

    public void reduceHealthPoints(double damage) {
        this.healthPoints -= damage;
        if (this.healthPoints < 0.0) {
            this.healthPoints = 0.0;
        }
    }

    public boolean isAlive() {
        return healthPoints > 0.0;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }
}
