package OfficeHours.Practice_03_25_20;

public class multiBranchIf_Practice {

    public static void main(String[] args) {
        int number = 0;

        if(number>0){
            System.out.println("It is positive number");
        }else if(number<0){
            System.out.println("It is negative number");
        }else{
            System.out.println("It is zero");
        }

        System.out.println("========================");

        String browserName = "Chrome";
        if(browserName=="Firefox"){
            System.out.println("Firefox is opening");
        }else if( browserName=="Chrome"){
            System.out.println("Chrome is opening");
        }else if(browserName=="Internet Explore"){
            System.out.println("IE is opening");
        }else if(browserName=="Safari"){
            System.out.println("Safari is opening");
        }else if(browserName=="Opera"){
            System.out.println("Opera is opening");
        }else{
            System.out.println("Invalid Browser Name");
        }
    }

}
