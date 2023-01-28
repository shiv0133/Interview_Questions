package ExceptionHAndeling;

public class DivideException {

    public void div(float a, float b) throws  ArithmeticException{
        System.out.println("The program has been started..........");

        if(b==0){
            throw new ArithmeticException();
        }
        else {
            float c=a/b;
            System.out.println("result::"+c);
        }
    }
    public static void main(String[] args) {
        DivideException obj=new DivideException();
        try {
            obj.div(5,3);

        }
        catch(ArithmeticException e){
            System.out.println("divide by zero...........Exception occur");
        }
        finally {
            System.out.println("This is finally block.......");
        }

    }
}
