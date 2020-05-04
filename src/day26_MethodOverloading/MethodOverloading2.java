package day26_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading2 {
    /*   first method: print the sum of 2 int num
         second: print the sum of 3 int num
         third: sum of 4 int num
     */
    public static void main(String[] args) {
        sum2Numbers(10,5);
        sum3Numbers(10,5,5);
        sum4Numbers(10,20,30,5);

        System.out.println("=========================");

        sum(10,5);
        sum(15,10,5);
        sum(10,20,30,5);

        int[] arr1={3,2,1,};
        char[] arr2={'z', 's','a'};
        double[] arr3={7.4, 6.5, 20.6};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3); //same method name, different parameter
    }

    public static void sum2Numbers(int a , int b){
        System.out.println(a+b);
    }
    public static void sum3Numbers(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum4Numbers(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void sum( int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

}
