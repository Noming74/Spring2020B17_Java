package day14_StringClass;

import java.util.Scanner;

public class Credentials2 {

    /*
    valid credentials are:
    username : cybertek
    password : cybertekschool

    if use entered both valid username and password ==> log in
    if valid passoword, invalid username ==> username is incorrect
    if valid user name, invalid passowrd => password is incorrect
    if both are invalid ==> invalid username and password
     */

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUsername= input.next();

        System.out.println("Enter your password");
        String inputPassWord= input.next();

        if( !inputUsername.isEmpty() && !inputPassWord.isEmpty() ){
        }
    }
}
