package SpecialCharacters;

import java.util.Scanner;

public class SpecialCount {
    public static void main(String[] args) {
        int upper = 0, lower = 0, number = 0, special = 0;
        int space=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the string input...........");
        String str=sc.next();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else if (ch == ' ' )
                space++;
            else
                special++;
        }

        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + number);
        System.out.println("Special characters : " + special);
}
}

