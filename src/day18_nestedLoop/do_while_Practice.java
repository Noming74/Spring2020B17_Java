package day18_nestedLoop;

public class do_while_Practice {
    /*
    print all the even number 0~100 in the same line separated by a space
     */
    public static void main(String[] args) {
        int num = 0;

        do{
            if(num % 2 ==0 ){
                System.out.print(num + " ");
            }

        num++;
       }while(num <= 100);

    }
}
