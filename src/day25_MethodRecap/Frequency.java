package day25_MethodRecap;

public class Frequency {
    public static void main(String[] args) {
        String str1="AAA"; //AA
        String str2="A";

        int count=0;
        if(str1.contains(str2)){
            count++;
            str1=str1.replaceFirst(str2, "");

        }
        System.out.println(str1);
    }
}
