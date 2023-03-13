package StringCountingRelated;

import java.util.Arrays;

public class LargestWorldStringUSINGspilit {
    public static void main(String[] args) {

        String str= "my name is a shira pratap singhendra";
       String largestWord="";

        String [] words= str.split(" ");
        System.out.println(Arrays.toString(words));

        int largest=words[0].length();

        for(int i=0;i< words.length;i++){
            if(words[i].length()>words[0].length()){
                largest=words[i].length();
                largestWord=words[i];
            }
        }
        System.out.println(largestWord);
    }
}
