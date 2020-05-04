package OfficeHours.Practice_04_15_2020;

public class return_Method {
    public static void main(String[] args) {
        //sum(10,20);
        int num1=sum2(500,600);
        System.out.println(num1);

        System.out.println("====================");
        String str="Cybertek";

        String result="";
        for(int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static int sum2(int a, int b){
        return a+b;
    }
}
