package Array_ArrayListRelatedPrograms;

import java.util.ArrayList;

public class ArrayListReverse {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(3);
        arr.add(4);
        arr.add(11);
        arr.add(13);
        System.out.println(arr);

        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(" "+arr.get(i));
        }
    }
}
