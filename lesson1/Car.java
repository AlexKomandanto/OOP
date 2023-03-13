package ru.gb.lesson1;

public class Car {

    public static Long idCounter = 1L;

    private Long id;

    public Car() {
        id = idCounter++;
    }

    public Long getId() {
        return id;
    }

}
