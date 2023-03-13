package ru.gb.lesson2.date;

import java.time.LocalDate;

public class CurrentDatePrinter {

    public void printCurrentDate(LocalDateConverter converter) {
        LocalDate now = LocalDate.now();
        String nowAsString = converter.convert(now);
        System.out.println(nowAsString);
    }

}
