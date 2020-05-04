package OfficeHours.Practice_04_15_2020;

public class void_method {
    public static void main(String[] args) {
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");

        System.out.println("==============");
        print();
        System.out.println("==============");
    }
    public static void print(){

    }
    public static void Vote(int age, boolean USCitizen){
        boolean eligibleToVote= age>=18 && USCitizen==true;
        if(eligibleToVote){
            System.out.println("You are eligable to vote");
        }else{
            System.out.println("You are not eligable to vote yet");
        }
    }
//write a prog if a person is eligible to smoke
    public static void EligibleToBuyCig(int age){
        if(age>18){
            System.out.println("Eligible to but");
        }else{
            System.out.println("Not eligible to buy");

        }
    }


}
