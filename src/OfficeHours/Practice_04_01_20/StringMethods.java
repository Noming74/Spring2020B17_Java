package OfficeHours.Practice_04_01_20;

public class StringMethods {

    public static void main(String[] args) {

        //charAt

        String str1= "Java ";
        //            0123

       char ch1 = str1.charAt(3);
        System.out.println(ch1);

        char ch2 = str1.charAt(4);
        System.out.println(ch2);

        //length(): returns the total number of chars, int

        String str2= "Cybertek School";
        int total = str2.length();
        System.out.println(total);

        int maxIndex= str2.length()-1; //last index number
         char ch3= str2.charAt(maxIndex);
        System.out.println(ch3);

        System.out.println("==============================");

        //concat(str): concantenation, returns new string
        String str3= "Cybertek";
                str3.concat(" School"); //"Cybertek School
        System.out.println(str3);

        String str4= "Java";
                str4= str4.concat(" if fun"); //Java is fun
        System.out.println(str4);

        System.out.println("=========================");

        //toLowercase() & toUpperCase(): change the case of the strings to upper or lower case. returns new strings

        String str5= "CYBERTEK SCHOOL";
                str5= str5.toLowerCase();

         String str6= "muhtar";
                str6= str6.toUpperCase();



    }
}
