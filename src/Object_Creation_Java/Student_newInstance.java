package Object_Creation_Java;

// ex. for newInstance Method....
public class Student_newInstance {
        String str="hello";
        public static void main(String args[])
        {
            try
            {
                //creating object of class
               // way 1 Student obj= Student.class.newInstance();
               // way 2
              Class b= (Class) Class.forName("Object_Creation_Java.Student_newInstance");
                Student_newInstance obj = (Student_newInstance) b.newInstance();
                System.out.println(obj.str);
            }
            catch(Exception e)
            {
                System.out.println("exception catch");
                e.printStackTrace();
            }
        }
    }

