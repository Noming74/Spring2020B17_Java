package day14_StringClass;

public class practice {

    public static void main(String[] args) {

        String gmail = "cybertekschool@gmail.com";
        String userinputGmail = "Cybertekschool@gmail.com,";

        boolean result = gmail.equals(userinputGmail); //false
        if(result) {
            System.out.println("Logged in");
        }
        System.out.println("=============");

        String PassWord = "mmasd 1235";
        if(PassWord.contains(" ")){
            System.out.println("PassWord can not have space in it");
        }else{
            System.out.println("valid password");
        }

        System.out.println("================");

        String wedAddress="www.amazon.com";
        if( wedAddress.startsWith("www.")){
            //false
            System.out.println("valid");
        }
    }
}
