package day25_MethodRecap;

import Resources.library;

public class FrrequencyOfCharacters {
    public static void main(String[] args) {

        String str="AABBCC"; //A2B2C2

        String NonDup= library.RemoveDuplicates(str);
        String result=""; //contains the frequancy of chars

            for(int i =0; i < NonDup.length();i++){
                String ch = ""+NonDup.charAt(i);//  "A"
                int num =  library.Frequency(str, ch);
                result += ch+num;
            }

        }
    }

