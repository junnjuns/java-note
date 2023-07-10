package ch10;

import java.time.*;

public class NewTimeEx0 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2023,07,10);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println();

        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(18,23);
        System.out.println("time1 = " + time1);
        System.out.println("time2 = " + time2);

        System.out.println();

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println("dateTime1 = " + dateTime1);
        System.out.println("dateTime2 = " + dateTime2);

        System.out.println();

        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(dateTime1, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime1 = " + zonedDateTime1);
        System.out.println("zonedDateTime2 = " + zonedDateTime2);
    }
}
