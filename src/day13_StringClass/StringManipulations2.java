package day13_StringClass;

import java.sql.SQLOutput;

public class StringManipulations2 {

    public static void main(String[] args) {

        String str = "Cybertek school is the best";
        //            012345678
        String schoolName= str.substring(0,8);

        System.out.println(schoolName);

        String fullName= "Kuzzat Altay";
        //                0123456789..

        String firstName= fullName.substring(0,6);
        String lastName= fullName.substring( 7,12);

        System.out.println(firstName);
        System.out.println(lastName);

        //full name = firstname lastname
        //gmail : lastname_firstname@gmail.com

        String Murtaza = "Murtaza Nazeeri";
        //                01234567

        String firstname= Murtaza.substring(0,7);
        String lastname= Murtaza.substring(9,15);
        System.out.println(firstname);
        System.out.println(lastname);

        //String gmail= lastname.concat("_").concat(firstname);
        String gmail = lastname + "_" +firstname +"@gmail.com";
        System.out.println(gmail);
    }
}
