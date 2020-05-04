package OfficeHours.Practice_04_15_2020;

public class return_statement {
    public static void main(String[] args) {
       method1();
        System.out.println("Hello");
    }
    public static void method1(){
        if(10>9){
            //return;
            System.exit(0);
        }
        System.out.println("Hello Cyber");
    }
    public static void method2(){
        return;
    }
    public static int method3(){
        return 123;
    }
}
