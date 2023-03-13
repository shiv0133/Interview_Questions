package Object_Creation_Java;

public class Emplyoee_Clone implements Cloneable{

    String name;
    String city;
    int age;

    public Emplyoee_Clone(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
