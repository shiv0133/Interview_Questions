import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Practice {
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
        al.add(7);
        al.add(8);

        Collections.sort(al);
        System.out.println(al);
        System.out.println("****************************************");

        int index= Collections.binarySearch(al,11);
        System.out.println(index);



    }
    }
