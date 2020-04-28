package day27_dateTime;

public class Find_Minimum {
    public static void main(String[] args) {
        int[] arr={5,4,7,5}; //4
        int minimum=arr[0];

        for(int each : arr){
            if(each<minimum){
                minimum=each;
            }
        }
        System.out.println(minimum);

    }
}
