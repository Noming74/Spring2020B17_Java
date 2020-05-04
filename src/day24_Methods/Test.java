package day24_Methods;

import Resources.library;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
       String str="Muhtar";

       String RevStr= library.Reverse(str);
        System.out.println(RevStr);
        int[] arr={5,9,10,3,2,-1};

       arr= library.sortDesending(arr );
        System.out.println(Arrays.toString(arr));


    }
}
