package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class RecursionExample1 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(10);
        al.add(12);
        al.add(13);
        System.out.println(al.size());

        // 10 is present at index 3.
        Collections.sort(al);
        System.out.println(al);
        int search=6;
        int start=0;
        int end=al.size()-1;

        while (end-start>1){
          int mid=(start+end)/2;

          if(mid<search){
             start=mid+1;
          } else if (mid>search) {
              end=mid-1;
          }

          if (start == search) {
                System.out.println("Found At Index " + start );
            }
            else if (end == search) {
                System.out.println("Found At Index " + end );
            }
            else {
                System.out.println("Not Found" );
            }
    }

        System.out.println(al.get(6));
    }
    }
