package StringRelatedPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountEachWords {
    public static void main(String[] args) {
       // String string = "big black bug bit a big black dog on his big black nose";
          String string = "Alice is girl and Bob is boy";
        System.out.println("original string::"+string +"\n");
        int count;

        //Split the string into words using built-in function
        String words[] = string.split(" ");


        System.out.println("***************** HashMAp Concept ************************************");
        HashMap<String,Integer> map=new HashMap<>();

        for(String var:words){
              if (map.containsKey(var)){
                   map.put(var,map.get(var)+1);
              }
              else {
                    map.put(var,1);
              }
        }
        System.out.println(map);
        System.out.println("*********** printing dublicate wordds**************");
        for(Map.Entry<String,Integer> entry: map.entrySet() ){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+"::"+entry.getValue());
            }
        }


        }
    }
