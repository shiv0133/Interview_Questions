package DesignPattern;

public class Singleton_Lazy {

    static Singleton_Lazy obj=null;

    public Singleton_Lazy() {
    }
   public static Singleton_Lazy getObj(){
        try {
            if(obj==null){
                obj=new Singleton_Lazy();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

       return null;
   }
}
