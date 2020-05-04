package day20_ArraysContinue;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name="Nomin";
        char[] character=name.toCharArray();

        System.out.println(Arrays.toString(character));

        String str1="Cybertek School";
        String str2="School Cybertek";

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        boolean equalsStr=Arrays.equals(ch1, ch2);

        System.out.println(equalsStr);


    }
}
