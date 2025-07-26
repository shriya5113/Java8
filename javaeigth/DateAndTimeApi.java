package javaeigth;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeApi {
    public static void main(String[] args) {
        //in java 8 we have more funtions which are use to differenate

        //1) LocalDate
        LocalDate date1 = LocalDate.now(); //gives current time
        LocalDate date2 = LocalDate.of(12,2,3);//uh can create own date
        LocalDate date3 = LocalDate.parse("2024-12-03");//you can string to date
        date1.getYear();//you can get date,year and month by using this
        LocalDate date5 = date1.minusDays(2);//similary we can minus days,month and years of any date
        date1.isAfter(date2);//gives boolean as it tells day1is afteredat2 or not  similarly isbefore

        //2) LocalDateTime

        LocalDateTime localDateTime = LocalDateTime.now();//give time also  with date
        //all functions are same of localDate

        //3)Local Time - in which we get time only and othe rfunctions are same in localDate

        //4) Duration - we can get difference in nano seconds only for small time difference and o/p in milliseconds
        Duration d1 = Duration.between(date1,date2);

        //5)Period - same as we have when you have large duration between years or months then we use period

        //6) DateTimeFormatter - you can chgane the date type formal
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("DD/MM/YYYY");
        LocalDate localDate = LocalDate.parse("22/01/2035",dateTimeFormatter);

        //7) ZoneDateTime - we can get any zone date time :UTC over all same in world that follows it

        //8) Instant - Represents a instaneous points on the timeline , typically used on machines stamps


    }
}
