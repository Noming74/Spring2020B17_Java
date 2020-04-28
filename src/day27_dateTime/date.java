package day27_dateTime;

import java.time.LocalDate;

public class date {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.of(2020, 10,25);
        System.out.println(date1);

        LocalDate birthDay=LocalDate.of(2020,12,25);
        System.out.println(birthDay);

        //isAfter(date2)
        boolean result1= date1.isAfter(birthDay);
        System.out.println(result1);

        //isBefore(date2)

        boolean result2=date1.isBefore(birthDay);
        System.out.println(result2);

        //isEqual(date2)
        boolean result3=date1.isEqual(birthDay);
        System.out.println(result3);

        //isLeapyear();
        boolean result4=birthDay.isLeapYear();
        System.out.println(result4);

        System.out.println("========================");

        LocalDate now=LocalDate.now(); //will print today's date
        System.out.println("Today is: "+now);
    }
}
