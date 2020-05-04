package day21_MultiDimentionsArrays;

public class ScrumTeam {
    public static void main(String[] args) {
        String[] DevTeam = {"Nom", "Him", "Kim", "Muh"};

        String[] TestersTeam = {"Pom", "Wer", "Guy", "Yun"};

        String[] PO={"Barzy", "Don"};

        String [] TestersTeam2={"Ih", "Min", "Tim", "Rim"};

        String[][] ScrumTeam={ DevTeam, TestersTeam, PO};
        //                       0        1
        ScrumTeam[0][3]="Jean";

        System.out.println(ScrumTeam[0][3]);
        String info=ScrumTeam[1][2];

        System.out.println(info);

        System.out.println("===================");

        for (String eachEmployee : ScrumTeam[2]){
            System.out.println(eachEmployee);
        }

        System.out.println("===========");
        System.out.println(ScrumTeam[2][1]);


    }
}
