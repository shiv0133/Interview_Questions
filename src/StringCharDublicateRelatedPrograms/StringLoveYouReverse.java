package StringCharDublicateRelatedPrograms;

import java.util.Arrays;

public class StringLoveYouReverse {
    public static void main(String[] args) {
        String str ="I LOVE JAVA";
        String str1 ="";
        // OUTPUT= I EVOL AVAJ

        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        System.out.println(str1);

        // from here we have to reverse the whole sentence....

       String [] arr =str1.split("");
       for (int i= arr.length-1;i>=0;i--){
           System.out.print(Arrays.toString(arr));
       }
    }
}
