package ru.gb.lesson1;

public class Cat extends Animal {

    public Cat(String name) {
        super(name, 19);
    }

    @Override
    public void voice() {
        System.out.println("Mew");
    }

    public void catMethod() {
        System.out.println("catMethod");
    }

}
