package day22_ArraysLoops;

public class nestedLoops_Practice {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };
        //print out all the even numbers in the same line
        //then count the odd numbers==> return the total odd numbers
        for(int i=0; i<numbers.length; i++){
            for(int j=0; i<numbers[i].length; i++){
                int num= numbers[i][j];
                if(num%2==0){
                    System.out.println(num +" ");
                }
            }


        }
    }
}
