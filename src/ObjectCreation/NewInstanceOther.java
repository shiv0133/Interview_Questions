package ObjectCreation;

public class NewInstanceOther {
    String str = "Shivendra";

    public static void main(String[] args) {

        try {
            NewInstanceOther obj = (NewInstanceOther) NewInstanceOther.class.newInstance();
            System.out.println(obj.str);
        }
        catch (Exception e) {
            System.out.println("Class not found exception.......");

        }


    }
}

