package day14_StringClass;

public class StringManipulations {

    public static void main(String[] args) {

        String x = "I like Java, Java is fun, Java programming is fun";

        int d1 = x.indexOf("Java is");
        System.out.println(d1);

        int d2 = x.indexOf(", J")+2;
        System.out.println(d2);

        int d3 = x.indexOf("J");
        System.out.println(d3);

        int d4 = x.indexOf("Java p");
        System.out.println(d4);

        char ch1= x.charAt(26);
        System.out.println(ch1);
    }
}
