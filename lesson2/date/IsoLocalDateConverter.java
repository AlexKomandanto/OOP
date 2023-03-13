package ru.gb.lesson2.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class IsoLocalDateConverter implements LocalDateConverter {

    @Override
    public String convert(LocalDate date) {
        return DateTimeFormatter.ISO_LOCAL_DATE.format(date);
    }






}
