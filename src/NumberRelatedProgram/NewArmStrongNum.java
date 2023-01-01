package NumberRelatedProgram;

public class NewArmStrongNum {
    public static void main(String[] args) {
        int num=153 ,count=0,rem,power = 1,sum=0;
        int temp=num;
        while (num>0){
            num=num/10;
            count=count+1;
        }
        System.out.println("No. of digits in the number is "+count);
        System.out.println("************************************************");
      while (temp>0){
          rem=temp%10;
          for (int i=1;i<=count;i++){
              power=power*rem;
          }
          sum=sum+power;
          temp=temp/10;
      }
        System.out.println(sum);
    }
}
