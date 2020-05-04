package day21_MultiDimentionsArrays;

public class Zoo {
    public static void main(String[] args) {
        String[] wildAnimals={"Tiger", "Lion", "Monkey", "Turtle"};
        String[] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};
        String [][] zoo={ wildAnimals, birds  };
        //                  0            1

       String kfc= zoo[1][3]; //"Chicken"
        System.out.println(kfc);

        System.out.println("===================");

        for(String eachBirds : zoo[1]){
            if( eachBirds.equals("Chicken")){
                continue;
            }
            System.out.println(eachBirds);
        }
        System.out.println("===================");
        for( String each: zoo[0]){
            if( each.equals("Turtle")){
                continue;
            }
            System.out.println(each);
        }


    }
}
