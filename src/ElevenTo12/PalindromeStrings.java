package ElevenTo12;

public class PalindromeStrings {
    public static void main(String[] args) {
        String str1 = "SIS";
        String str2 = "";

        for (int i = str1.length()-1;i>=0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        if (str1.equals(str2)) {
            System.out.println("Both String ara Palindrome.........");
        }
        else {
            System.out.println("Not Palindrome......");
        }
    }
}
