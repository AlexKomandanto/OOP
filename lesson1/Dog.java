package ru.gb.lesson1;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Bark!");
    }

}
