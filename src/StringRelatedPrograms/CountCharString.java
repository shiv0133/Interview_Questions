package StringRelatedPrograms;

import java.util.Scanner;

public class CountCharString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter character for counting::");
        char a=sc.next().charAt(0);
        System.out.println("input::"+a);
        int count=0;
        String str="shivendrassssas";

        for( int i=0; i<str.length(); i++ ) {
            if((str.charAt(i)) == a){
                count++;
            }
        }
        System.out.println("Dublicate number is::"+count);
    }
}
