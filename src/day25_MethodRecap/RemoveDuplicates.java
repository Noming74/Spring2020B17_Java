package day25_MethodRecap;



public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="ABABABABABABAB";
        String result= ""; //AB

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i); //A
            if(!result.contains(""+ch)){
                result +=ch;
            }
        }
        System.out.println(result);
    }

}
