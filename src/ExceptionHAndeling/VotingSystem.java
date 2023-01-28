package ExceptionHAndeling;

public class VotingSystem {

    void age(int age) throws AgeCustomException{
        if(age<18){
        throw new AgeCustomException("Age is under 18");
    }
        else {
            if(age>18){
                System.out.println("you are allowed to vote");
            }
        }
    }

    public static void main(String[] args) {
        VotingSystem obj=new VotingSystem();
        try {
            obj.age(25);
        }
        catch (AgeCustomException e) {
            System.out.println("exception occur");
        }
        finally {
            System.out.println("this is finally block...");
        }
    }
    }

