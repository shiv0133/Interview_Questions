package STringDublicateWordRelated;

public class CountWordsLenthCharacter {

    // here we count length of each word.....
    public static void main(String[] args) {
        int count;
        String str = "Shivendra pratap singh";

        String [] words=str.split(" ");

        System.out.println(words.hashCode());

        for(int i=0;i<words.length;i++){
            count=0;
            String str1=words[i];

                for(int j=0;j<str1.length();j++) {

                       if(str1.charAt(j)!=' '){
                           count++;
                       }
                }
            System.out.println(words[i]+"::"+count);
        }
}
}
