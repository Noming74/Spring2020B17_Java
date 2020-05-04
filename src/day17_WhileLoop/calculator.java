package day17_WhileLoop;
/* write a program that can calculate the two numbers based on the user provided operators, the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
								(assume that only the +, -, *, /, and % will be entered)
						then the system will give the result based on the operator
						at the end it will ask if the user want's to calculate another numbers, if user
						entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
								(you will need a lop that has true condition without the iterator)

 */

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();
        double totalPrice1 = price1 * count1;

        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();
        double totalPrice2 = price2 * count2;

        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();
        double totalPrice3 = price3 * count3;

        String report = "";

        double totalPrice;
        if (count1 <= 0) {
            report = ("Item2: " + item2 + " Price: " + price2 + ",Item3: " + item3 + " Price: " + price3);
            totalPrice = totalPrice2 + totalPrice3;
        } else if (count2 <= 0) {
            report = ("Item1: " + item1 + " Price: " + price1 + ",Item3: " + item3 + " Price: " + price3);
            totalPrice = totalPrice1 + totalPrice3;
        } else if (count3 <= 0) {
            report = ("Item1: " + item1 + " Price: " + price1 + ",Item2: " + item2 + " Price: " + price2);
            totalPrice = totalPrice2 + totalPrice1;
        } else {
            report = ("Item1: " + item1 + " Price:" + price1 + ",Item3: " + item3 + " Price: " + price3 + ",Item2: " + item2 + " Price: " + price2);
            totalPrice = totalPrice2 + totalPrice1 + totalPrice3;
        }


        System.out.println(report);
        System.out.println("Total price: " + totalPrice);

    }
}


