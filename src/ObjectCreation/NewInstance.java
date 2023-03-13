package ObjectCreation;

public class NewInstance {

    String str="Shivendra";

    public static void main(String[] args) throws ClassNotFoundException {
     try {
         Class cls=  (Class) Class.forName("ObjectCreation.NewInstance");
         NewInstance obj = (NewInstance) cls.newInstance();
         System.out.println(obj.str);
     }
     catch (Exception e){
         System.out.println("Class not found exception occurred.......");
     }

}
}
