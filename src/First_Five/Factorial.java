package First_Five;

public class Factorial {
    public static void main(String[] args) {
        int num=6,fact=1;
      for (int i=1;i<=num;i++){
          fact=fact*i;
      }
        System.out.println("factorial of given number is::" +fact);
    }
}
