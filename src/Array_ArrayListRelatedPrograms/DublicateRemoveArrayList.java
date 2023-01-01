package Array_ArrayListRelatedPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DublicateRemoveArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1);
        System.out.println("Arraylist With Dublicate........");
        for (Integer var:list1){
            System.out.println(var);
        }
        Set<Integer> list2=new HashSet<>();
        list2.addAll(list1);
        System.out.println("After removing duplicates present in HashSet....");
        for (Integer var:list2){
            System.out.println(var);
        }
        System.out.println("After removing duplicates present in list1 Arraylist....");
        list1.clear();         // first clear the old m/m of array list........
        list1.addAll(list2);      // hashset list se dobara element array list me add me kar die
        for (Integer var:list1){
            System.out.println(var);
        }

    }
}
