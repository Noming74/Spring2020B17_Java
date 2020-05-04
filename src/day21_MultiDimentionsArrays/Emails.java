package day21_MultiDimentionsArrays;

public class Emails {
    public static void main(String[] args) {
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};
        for (String EachEmail : emails) {
            if (!EachEmail.endsWith("@gmail.com")) {
                System.out.println(EachEmail);
            }
        }
    }
}

