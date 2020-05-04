package day10_Switch_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {

            Scanner input = new Scanner (System.in);

            System.out.println("Enter your first number");
                byte num1= input.nextByte();
            System.out.println("Enter your number: ");
                byte num2 = input.nextByte();

                int total = (num1+num2);
        System.out.println("The sum of those two numbers are: " +total );


    }
}
