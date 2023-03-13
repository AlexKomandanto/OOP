package ru.gb.lesson2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        Collections.sort(arrayList);
        Collections.sort(linkedList);

        MyInterface.bar();

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

        List<Integer> integers = List.of(1, 2, 3, 4, 2, 3);

    }

}
