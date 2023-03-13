package ru.gb.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        .jar

        int x = 5;
        long y = 7L;
        double d = 5.3;

        Integer xx = Integer.valueOf(5); //new Integer(5);
        Long yy = 7L; // new Long(7);

        Car.idCounter += 10L;

        Car firstCar = new Car();
        Car secondCar = new Car();
        Car thirdCar = new Car();
        Car fourthCar = new Car();

        System.out.println(firstCar.getId()); // 1
        System.out.println(secondCar.getId()); // 2
        System.out.println(thirdCar.getId()); // 3
        System.out.println(fourthCar.getId()); // 4

        Animal animal = new Animal("animalName");
        Cat cat = new Cat("catName");
        Dog dog = new Dog("dogName");

        Animal animalCat = new Cat("catName");

        foo(animalCat);
        foo(cat);
        foo(dog);


        Integer xxx = null;// new Integer(5);
        primitiveIntMethod(xxx);

        long yyy = 3L;
        longMethod(yyy);


        List<Animal> animals = new ArrayList<>();
        animals.add(animalCat);
        animals.add(new Dog("dogName"));
    }

    public static void primitiveIntMethod(int x) {
        System.out.println(x);
    }

    public static void longMethod(Long x) {

    }


    public static void foo(Animal animal) {
        animal.voice();
        if (animal instanceof Cat cat) {
//            Cat cat = (Cat) animal; // cast
            cat.catMethod();
        }

    }

}