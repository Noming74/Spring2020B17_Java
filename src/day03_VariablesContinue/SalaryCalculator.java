package day03_VariablesContinue;

public class SalaryCalculator {

    public static void main (String [] args){

        double rate = 55;
        float statetaxRate = 0.04F;
        float federalTaxRate = 0.22f;
        byte weeklyHours = 40;

        // salary = rate * weeklyHour * 4 * 12
        double salary = rate * weeklyHours * 52;

        // stateTax = salary * stateTaxRate
        double stateTax = salary * statetaxRate;

        // FederalTax = salary * federalTaxRate;
        double federalTax = salary * federalTaxRate;

        // income after tax = salary - (stateTax + federalTax );
        double incomeAfterTax = salary - (stateTax + federalTax);

        System.out.println("Your salary is: " + salary); // concatenation
        System.out.println("State tax is: " + stateTax); // state tax is 4575
        System.out.println("Federal tax is: " + federalTax);
        System.out.println(" Total tax is : " + ( stateTax + federalTax) );
        System.out.println("Your take home salary is : " + incomeAfterTax);

        System.out.println(9 + 3 ); // 12, addition
        System.out.println( "9" + "3" ); // 93
        System.out.println(9 + "3"); //93

        char ch1 = 'A';
        System.out.println(ch1);

        char ch2 = '1';
        System.out.println(ch2);

        char ch3 = 100;
        System.out.println(ch3);

        char ch4 = 50000;
        System.out.println(ch4);

        char ch5 = 48000;
        System.out.println(ch5);

        char ch6 = 32000;
        System.out.println(ch6);

        char character1 = 'a'; // number is 97















    }








}
