package Second_Five;

public class NewFreqArray {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        //Array a will store frequencies of element
        int [] a = new int [arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    //To avoid counting same element again
                    a[j] = visited;
                }
            }
            if(a[i] != visited)
                a[i] = count;
        }

        //Displays the frequency of each element present in array
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < a.length; i++){
            if(a[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + a[i]);
        }
        System.out.println("----------------------------------------");
    }
}

