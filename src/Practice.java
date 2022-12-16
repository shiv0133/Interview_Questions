import javafx.print.Collation;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(12);
        list.add(4);
        list.add(5);
        list.add(3);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
