import java.util.*;

public class UsingBuiltiNBinarySearchMethod {
    public static void main(String[] args) {
        ArrayList <Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(10);
        al.add(12);
        al.add(13);


        // 10 is present at index 3.
        int index = Collections.binarySearch(al, 10);
        System.out.println(index);

        // 13 is not present. 13 would have been inserted
        // at position 4. So the function returns (-4-1)
        // which is -5.
        int index1 = Collections.binarySearch(al, 7);
        if(index1>0){
        System.out.println(index1);
    }
        else {
            System.out.println("element is not found in the list...........");
        }
    }
}
