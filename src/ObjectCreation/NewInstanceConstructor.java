package ObjectCreation;

import Object_Creation_Java.DemoConstructorInstance;

import java.lang.reflect.Constructor;

public class NewInstanceConstructor {

    String str="Shivendra";

    public static void main(String[] args) {

        try {
            Constructor<NewInstanceConstructor> obj =NewInstanceConstructor.class.getConstructor();
             NewInstanceConstructor obj1= obj.newInstance();
            System.out.println(obj1.str);
        }
        catch (Exception e) {
            System.out.println("Exception occur here....");
        }
        }
    }
