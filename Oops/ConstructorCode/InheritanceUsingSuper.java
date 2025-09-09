package ClassPractice.OOPS.ConstructorsCode.ConstructorMainCode;

public class InheritanceUsingSuper {
    String name;
    InheritanceUsingSuper(String name)
    {
        this.name=name;
    }
    class Student extends InheritanceUsingSuper{
        int age;
        Student(String name,int age)
        {
            super(name);
            this.age=age;
            System.out.println("name:"+name+",age:"+age);
        }
    }
    public static void main(String[] args) {
        InheritanceUsingSuper o1=new InheritanceUsingSuper("Unknown");

    }
}
