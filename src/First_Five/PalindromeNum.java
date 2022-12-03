package First_Five;

public class PalindromeNum {
    public static void main(String[] args) {
        int r,sum=0,temp;
        int num=455;
        temp=num;
        while (num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Number is Palindrome");
        }
        else System.out.println("Not palindrome");
    }
}
