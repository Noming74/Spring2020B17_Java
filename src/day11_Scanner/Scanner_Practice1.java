package day11_Scanner;

import java.util.Scanner;

public class Scanner_Practice1 {
    public static void main(String[] args) {





        Scanner input= new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        String fullName = firstName+" "+lastName;
        System.out.println("Full name is "+fullName);

        System.out.println("Are you employed?");
        boolean employmentStatus = input.nextBoolean();

        double salary = 0;
        if(employmentStatus==true){
            System.out.println("Enter your salary: ");
        }

        System.out.println("Full name is: " +fullName);
        System.out.println("Employes: "+employmentStatus);
        System.out.println("Salary: ");


    }
}
