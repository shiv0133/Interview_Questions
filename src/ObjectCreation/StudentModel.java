package ObjectCreation;

public class StudentModel  implements Cloneable {
    String name;
    String sub;
    int marks;

    public StudentModel(String name, String sub, int marks) {
        this.name = name;
        this.sub = sub;
        this.marks = marks;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
