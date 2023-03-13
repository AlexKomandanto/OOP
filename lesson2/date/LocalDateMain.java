package ru.gb.lesson2.date;

public class LocalDateMain {

    public static void main(String[] args) {
        CurrentDatePrinter currentDatePrinter = new CurrentDatePrinter();
        currentDatePrinter.printCurrentDate(new StandardLocalDateConverter());
        currentDatePrinter.printCurrentDate(new IsoLocalDateConverter());
        currentDatePrinter.printCurrentDate(new MySpecialLocalDateConverter());
    }

}
