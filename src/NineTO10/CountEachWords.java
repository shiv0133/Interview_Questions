package NineTO10;

import java.util.HashMap;
import java.util.Iterator;

public class CountEachWords {
    public static void main(String[] args) {
        String string = "big black bug bit a big black dog on his big black nose";

        System.out.println("original string::"+string +"\n");
        int count;

        //Split the string into words using built-in function
        String words[] = string.split(" ");
        System.out.println("after spilit method::\n"+words+"\n");

        System.out.println("***************** HashMAp Concept ************************************");
        HashMap<String,Integer> map=new HashMap<>();

        for(String var:words){
              if (map.get(var)==null){
                   map.put(var,1);
              }
              else {
                    map.put(var,map.get(var)+1);
              }
        }
        System.out.println(map);

        Iterator<String> itr=map.keySet().iterator();

        while (itr.hasNext()){
            boolean temp =itr.hasNext();
            if(map.get(temp)>1){
                System.out.println(temp+"::"+map.get(temp));
            }
        }
    }
}
