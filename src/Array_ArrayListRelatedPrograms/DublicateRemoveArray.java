package Array_ArrayListRelatedPrograms;

import java.util.Arrays;

public class DublicateRemoveArray {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,1,2,3,4,5,5,2,5};

        Arrays.sort(arr);
        int j=0;

         int [] temp= new int[arr.length];
        System.out.println(Arrays.toString(arr));
        for(int i=0;i< args.length;i++) {
           if(arr[i]!=arr[i+1]){
               temp[j++]=arr[i];
           }
        }
        temp[j++]=arr[arr.length-1];

        System.out.println(Arrays.toString(temp));
    }
}
