package ObjectCreation;

public class StudentClone {
    public static void main(String[] args) {
        StudentModel obj=new StudentModel("Ravi","hindi",56);
        System.out.println(obj.name);

        try {
           StudentModel obj1= (StudentModel) obj.clone();
            System.out.println(obj.name);
        }
        catch (Exception e){
            System.out.println("Exception occurs.....");
        }
    }
}
