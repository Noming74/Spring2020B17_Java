package day16_ForLoop;

public class BreakStatement {

    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {

            if (i == 'e') {
                break;
            }

            System.out.println(i);


        }
    }
}

