package OfficeHours.Practice_03_25_20;

public class NestedIf_Practice2 {

    public static void main(String[] args) {

        int salary = 45000;
        short creditscore = 750;
        byte jobHistory= 1;

        if(salary >50000);
        if(creditscore > 650){ // might be eligible

            if(jobHistory>=2){ // eligible for loan
                System.out.println("You are qualified");

            }else{ // not eligible due to job history
                System.out.println("You do not have enough job history, come back later");
            }


        }else{ // not eligible due to credit score
            System.out.println("You do not have good credit score");
        }


    } {
        System.out.println("You need have a job that pays $50000");
    }







}
