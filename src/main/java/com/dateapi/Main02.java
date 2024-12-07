package com.dateapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Main02 {
    public static void main(String[] args) {
        printChristmasEveDays();
    }

    static void printChristmasEveDays() {
        LocalDate date = LocalDate.of(2019, Month.DECEMBER, 24);

        for (int i = 0; i < 10; i++) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            System.out.println("Christmas Eve " + date.getYear() + " falls on: " + dayOfWeek);
            date = date.plusYears(1);
        }
    }
}
