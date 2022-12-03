package Second_Five;

import java.util.Arrays;
import java.util.Scanner;

public class FreqArray {
    public static void main(String[] args) {
           int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of array");
        int size = sc.nextInt();
        System.out.println("size of array is::" + size);
        int[] arr1 = new int[size];
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter the elements of array");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc1.nextInt();
        }
        System.out.println(" " + Arrays.toString(arr1));

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter the element whose frequency you have to find.....");
        int frq=sc2.nextInt();

        for(int i=0;i< arr1.length;i++) {
            if (arr1[i] == frq) {
                count++;
            }
        }
        if (count>0){
            System.out.println("elemnet is  found::"+"Frequency is:"+count);
        }
        else
            System.out.println("elemnet is not found::"+"Frequency is:"+count);
        }
    }

