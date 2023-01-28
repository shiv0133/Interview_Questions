package StringCountingRelated;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {

        //anagram means here we compare two string the string have equal number
        //  of characters  and same character but may be in different order.....

        String str1="Racing";
        String str2="Caring";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()){
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            //here we have to compare both sorted character arrays...
                         boolean result =Arrays.equals(arr1,arr2);
                         if (result==true){
                             System.out.println("Given Strings are Anagram");
                         }
                         else{
                             System.out.println("Not Anagram......");
                         }
        }
        else {
            System.out.println("Both String are unequal in length");
        }

    }
}
