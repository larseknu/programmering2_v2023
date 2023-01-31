package no.hiof.larseknu.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("******Playing with LocalDate*****");
        LocalDate today = LocalDate.now();
        System.out.println(today + " - todays date");

        System.out.println(today.getDayOfWeek() + " - is day of week in " + today);
        System.out.println(today.getMonth() + " - is the month in " + today);
        System.out.println(today.format(DateTimeFormatter.ofPattern("EEEE dd. MMMM")) + " - our own representation of: " + today);

        LocalDate minus10Years = today.minusYears(10);
        System.out.println(minus10Years + " - minus 10 years");

        LocalDate birthday = LocalDate.of(1856, 7, 10);
        System.out.println(birthday + " - Nikola Tesla birthday");

        System.out.println(LocalDate.EPOCH + " - EPOCH");

        LocalDate tenYearAfterEpoch = LocalDate.ofEpochDay(365*10+2);
        System.out.println(tenYearAfterEpoch + " - ten years after epoch");

        LocalDate dateFromString = LocalDate.parse("2023-01-01");
        System.out.println(dateFromString + " - date from String");

        dateFromString = LocalDate.parse("03.02.01", DateTimeFormatter.ofPattern("dd.MM.yy"));
        System.out.println(dateFromString + " - date from String");

    }
}
