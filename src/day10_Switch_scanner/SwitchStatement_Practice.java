package day10_Switch_scanner;

public class SwitchStatement_Practice {
    public static void main(String[] args) {

        int num = 0 ;
         switch(2){
             case 1:
                    num +=3;
             case 2:
                    num +=2;
                    break;
             case 3:
                    num +=10;
             default :
                    num -= 5;
                    break;
         }

        System.out.println(num);

    }
}
