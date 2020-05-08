package replits;
import java.util.Scanner;

// count how many even numbers they are

public class CountEven {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

            //TODO: Write your code
            int count=0;
            for(int i=0; i<nums.length; i++){
                if(nums[i]%2==0){
                    count++;
                }
            }
            System.out.println(count);

        }
    }

