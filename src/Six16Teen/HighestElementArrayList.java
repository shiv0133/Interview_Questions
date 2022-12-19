package Six16Teen;

import java.util.ArrayList;

public class HighestElementArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(1);
        list.add(6);
        list.add(18);
        list.add(12);
        list.add(15);
        list.add(5);

        int highest= list.get(0);
        int secondHighest=list.get(0);

        for(int i=1;i< list.size();i++){
            if(highest<list.get(i)){
                highest= list.get(i);
            }
        }
        System.out.println("Maximum element present is::"+highest);

        for(int i=1;i<list.size();i++){
            if(highest>list.get(i) && secondHighest<list.get(i)){
                secondHighest= list.get(i);
            }
        }
        System.out.println("Second highest element present is::"+secondHighest);
    }

}
