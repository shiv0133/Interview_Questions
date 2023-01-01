package Array_ArrayListRelatedPrograms;

public class SecondHighArrary {
    public static void main(String[] args) {

      int [] arr= {1,2,3,12,2,0,2,3,12,4,59,60};
       int max=arr[0];
       int secondMax=arr[0];

       for(int i=0;i<arr.length;i++){
         if (arr[i]>max){
            max=arr[i];
         }

       }
      System.out.println("largest element is::"+max);
       for (int i=0;i<arr.length;i++){
         if( arr[i]< max && arr[i]>secondMax ){
               secondMax=arr[i];
         }

       }
      System.out.println("second higest number is::"+secondMax);



    }
}
