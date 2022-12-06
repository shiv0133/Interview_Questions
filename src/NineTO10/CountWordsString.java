package NineTO10;

public class CountWordsString {
    public static void main(String[] args) {
        String str="my name is shivendra pratap singh what is your name";
        int count=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println("Number of words present in given String is::"+count);
    }
}
