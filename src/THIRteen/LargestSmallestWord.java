package THIRteen;

public class LargestSmallestWord {
    public static void main(String[] args) {
        int count=0;
        String str1="My name is shivendra pratap singh";

        for(int i=0;i<str1.length();i++){

            if(str1.charAt(i)!=' '){
                count++;
                System.out.println(count);
            }

        }
        count=0;

    }
}
