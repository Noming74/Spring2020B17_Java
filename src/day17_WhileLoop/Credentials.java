package day17_WhileLoop;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String username = input.next();
        System.out.println("Enter password");
        String password = input.next();
        boolean valid = username.equalsIgnoreCase("radugusanu") &&
                (password.equalsIgnoreCase("cybertek"));
        int count = 1;
        while (!valid){
            System.out.println("please re-enter your credentials");
            System.out.println("Enter username");
            username = input.next();
            System.out.println("Enter password");
            password = input.next();
            valid = username.equalsIgnoreCase("cybertek") &&
                    (password.equalsIgnoreCase("123456789"));
            ++count;
            if(count > 3 && !valid){
                System.out.println("Your account is locked");
                break;
            }
            System.out.println("Logged in");
        }
    }
}
