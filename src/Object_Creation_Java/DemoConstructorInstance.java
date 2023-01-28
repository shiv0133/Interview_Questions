package Object_Creation_Java;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DemoConstructorInstance implements Cloneable {

    String str = "Aditi";
    String str1="Shivendra";

    public static void main(String[] args) {
        try {
            Constructor<DemoConstructorInstance> obj = DemoConstructorInstance.class.getConstructor();
            DemoConstructorInstance obj1= obj.newInstance();
            System.out.println(obj1.str);

           DemoConstructorInstance obj2= (DemoConstructorInstance) obj1.clone();
            System.out.println(obj2.str1);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception Catched.....");
        }

    }
}
