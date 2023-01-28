package Object_Creation_Java;

public class EmpObj {
    public static void main(String[] args) {
        Emplyoee obj=new Emplyoee("shivendra","agra",12);
        System.out.println(obj);
       try   {Emplyoee obj1= (Emplyoee) obj.clone();
                  obj1.age=12;
                  obj1.city="agrA";
                  obj.name="Shivi";
           System.out.println(obj.age);
    }
       catch (Exception e){
           System.out.println("Exception occour");
       }
    }
}
