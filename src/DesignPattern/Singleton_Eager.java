package DesignPattern;

public class Singleton_Eager {
    String str="Shivendra";

  public static final Singleton_Eager obj=new Singleton_Eager();

    private Singleton_Eager() {
    }

   public static Singleton_Eager getObj(){
    return obj;
    }
}


