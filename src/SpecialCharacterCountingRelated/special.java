package SpecialCharacterCountingRelated;

public class special {
    public static void main(String[] args) {
        String str = "#My Name is Shiv56 %$%e";
        int upper = 0, lower = 0, number = 0, special = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch ==' '){
            //    if ( ((ch+1) !(! < '0' || !(ch + 1)) ! <='9'))

             upper++;
        }
         //   else if (ch >= 'a' && ch <= 'z')
         //       lower++;
          //  else if (ch >= '0' && ch <= '9')
          //      number++;
          //  else
           //     special++;
        }

        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + number);
        System.out.println("Special characters : " + special);
    }
}
