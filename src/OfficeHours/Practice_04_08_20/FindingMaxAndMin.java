package OfficeHours.Practice_04_08_20;

import java.util.Scanner;

public class FindingMaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = -2147483648;
        int min= 217483647;


        int i = 1;
        while (i <= 3) {

            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > max) {
                max = num;
            }
            if(num<min){
                min=num;
            }
            i++;
        }
        System.out.println("max number is "+max);
        System.out.println("min number is "+min);
    }
}
