package Second_Five;

public class NumberOfDuplicateCharString {
    public static void main(String[] args) {
        // in this program we have to find duplicate an elements
            String string1 = "shivendra pratap singh";
            int count;
            //Converts given string into character array
            char string[] = string1.toCharArray();

            System.out.println("Duplicate characters in a given string: ");
            //Counts each character present in the string

        for(int i = 0; i <string.length; i++) {
                count = 1;
                for(int j = i+1; j <string.length; j++) {
                    if(string[i] == string[j] ) {

                        count++;
                        //Set string[j] to 0 to avoid printing visited character

                    }
                }
                //A character is considered as duplicate if count is greater than 1
                if(count > 1 )
                    System.out.println(string[i]+"::"+count);
            }
        }
    }

