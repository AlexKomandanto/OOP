package ru.gb.lesson1;

public class Animal extends Object {

    private String name;
    private int age;
    private Car car;

    public Animal(String name) {
        this(10, name);
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public void voice() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
