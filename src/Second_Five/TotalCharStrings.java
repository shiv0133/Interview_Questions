package Second_Five;

public class TotalCharStrings {
    public static void main(String[] args) {
        String str ="shivendra pratap singh";
        int count=0;
        for(int i=0;i<str.length();i++) {

            if ((str.charAt(i))!= ' ') {
                count++;
            }
        }
        System.out.println("Total number of Character in the String is::"+count);
    }
}
