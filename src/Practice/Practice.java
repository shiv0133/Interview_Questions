package Practice;


import java.util.HashMap;
import java.util.Map;

public class Practice {
    HashMap<String, Integer> map=new HashMap<>();
    void counting() {
        int count;
        String str="shivendra Pratap Singh";
        System.out.println("our present String is::"+str);
         str=str.replace(" ","");
         str=str.toLowerCase();
         char [] arr=str.toCharArray();

         for(int i=0;i<str.length();i++){
             count=1;
             for(int j=i+1;j<str.length();j++){
                 if(arr[i]==arr[j]){
                     count++;
                 }
             }
             if(count>1) {
                 System.out.println(arr[i] + "::" + count);
             }
         }
    }

    public static void main(String[] args) {
        Practice practice=new Practice();
        practice.counting();
    }


}
