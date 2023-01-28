package StringCharDublicateRelatedPrograms;

import java.util.HashMap;
import java.util.Map;

public class DublicateCharCountingUsingHAshMap {
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        String str="shivendra pratap singh";
        str=str.toLowerCase();
        str=str.replace(" ","");


        char [] c=str.toCharArray();
      //  System.out.println(c);

        for(char var:c){
            if(map.containsKey(var)){
                map.put(var, map.get(var)+1);
            }
            else {
                map.put(var,1);
            }
        }
        System.out.println("printing number of character of all letters..............");
        System.out.println(map);
        System.out.println("*************************************");
        System.out.println("printing only dublcates........" );
        for (Map.Entry<Character, Integer> entry:map.entrySet()){

            if(entry.getValue()>1){
                System.out.println(entry.getKey()+"::"+ entry.getValue());
            }
       // for (Map.Entry<Character, Integer> entry :
         //       map.entrySet()) {

           // if (entry.getValue() > 1) {
             //   System.out.println(entry.getKey()
               //         + " : "
                 //       + entry.getValue());
            }
        }

            }


