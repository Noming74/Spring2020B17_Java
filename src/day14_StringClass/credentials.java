package day14_StringClass;

import java.util.Scanner;

public class credentials {

    /*
        useName: cybertek
        passWord: cybertekschool

      */

    public static void main(String[] args) {
        String validuserName= "Cybertek";
        String validPassWord= "cybertekschool";

         Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");

        String inputUsername= input.next();

        System.out.println("Enter your password");

        String inputPassWord= input.next();

        if( inputUsername.equals(validuserName) && inputPassWord.equals(validPassWord)){
            System.out.println("Log in successfully");
        }else{
            System.out.println("Invalid credentials");

        }

    }


}
