package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Main {
    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("four", 4);
        numbers.put("Five", 5);
        System.out.println("HashMap: " + numbers);

        // access each entry of the hashmap
        System.out.println("Entries: ");
        System.out.println("***********************************");

        // entrySet() returns a set view of all entries
        // for-each loop access each entry from the view

        // how apply condition on hashMap key and value for accessing some particular values and all...
        for(Map.Entry<String, Integer> entry: numbers.entrySet()) {

           if(entry.getValue()==3 ){
               System.out.println(entry.getKey());
           }

        }
    }
}