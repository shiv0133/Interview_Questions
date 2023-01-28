package SpecialCharacterCountingRelated;

import java.util.Scanner;

public class SpecialCharacters {
    public static void main(String[] args) {
      //  String str="My name is 4shiv   singh";

        //  here i have to count those words only who have starting with alphabets only..?


        String str;
        int i, alph, digi, spl;
        i = alph = digi = spl = 0;
        char ch;

      Scanner  sc= new Scanner(System.in);

        System.out.print("\nPlease Enter Alpha Numeric Special String =  ");
        str = sc.nextLine();

        while(i < str.length())
        {
            ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
                alph++;
            }
            else if(ch >= '0' && ch <= '9') {
                digi++;
            }
            else {
                spl++;
            }
            i++;
        }
        System.out.println("\nNumber of Alphabet Characters  =  " + alph);
        System.out.println("Number of Digit Characters     =  " + digi);
        System.out.println("Number of Special Characters   =  " + spl);

    }
}
