package ru.gb.lesson2.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StandardLocalDateConverter implements LocalDateConverter {

    @Override
    public String convert(LocalDate date) {
        // 06.03.2023
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return pattern.format(date);
    }

}
