package Object_Creation_Java;

public class Emp_clone {
    public static void main(String[] args) {
        Emplyoee_Clone obj=new Emplyoee_Clone("shivendra","agra",12);
        System.out.println(obj.age);

       try   {
           Emplyoee_Clone obj1= (Emplyoee_Clone) obj.clone();

           System.out.println(obj.age);
    }
       catch (Exception e){
           System.out.println("Exception occour");
       }
    }
}
