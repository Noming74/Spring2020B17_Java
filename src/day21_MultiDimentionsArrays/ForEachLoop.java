package day21_MultiDimentionsArrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        for(int eachElement : nums){
            System.out.println(eachElement);
            //use this forEachLoop whenever when we dont need to do use index.

        }

        String[] students={"Muh", "ki", "jok"};
        for( String eachStudents: students){
            System.out.println(eachStudents);
        }

        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        for(int each : arr1){
            if(each<5){
                continue;
            }
            System.out.println(each);
        }
    }
}
