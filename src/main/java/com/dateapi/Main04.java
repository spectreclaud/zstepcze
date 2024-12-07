package com.dateapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Main04 {
    public static void main(String[] args) {
        LocalDate unixEpoch = LocalDate.of(1970, Month.JANUARY, 1);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(unixEpoch, currentDate);

        int totalMonths = period.getYears() * 12 + period.getMonths();

        System.out.println("Number of months since the beginning of the Unix epoch: " + totalMonths);
    }
}
