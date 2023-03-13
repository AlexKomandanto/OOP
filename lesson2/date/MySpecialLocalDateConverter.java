package ru.gb.lesson2.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MySpecialLocalDateConverter implements LocalDateConverter {

    @Override
    public String convert(LocalDate date) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("d MMM yy");
        return pattern.format(date);
    }

}
