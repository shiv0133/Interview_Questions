package NumberRelatedProgram;

import java.util.Scanner;

public class NewArmStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int n = sc.nextInt();
        int temp = n;
        int num = n;
        int rem, count = 0;
        int sum = 0;

        //if 1^3+5^3+3^3= 153 then number is ArmStrong.....

        while (temp > 0) {
            rem = temp % 10;
            temp = temp / 10;
            count++;
            // System.out.println(rem);
        }
        //System.out.println(count);

            while (num > 0) {
                rem = num % 10;
                sum = (int) (sum + Math.pow(rem, count));
                num = num / 10;
            }
            // System.out.println(sum);
            if (sum == n) {
                System.out.println("Given number armstrong in nature...::" + sum);
            } else {
                System.out.println("Number is not Armstrong........::" + sum);
            }
        }
    }
