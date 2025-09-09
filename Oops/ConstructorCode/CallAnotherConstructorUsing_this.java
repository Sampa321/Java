package ClassPractice.OOPS.ConstructorsCode.ConstructorMainCode;

public class CallAnotherConstructorUsing_this {
    String name;
    int age;
    CallAnotherConstructorUsing_this()
    {
        this("Unknown",20); //calls parameterized constructors
    }
    CallAnotherConstructorUsing_this(String name,int age)
    {
        this.name=name;
        this.age=age;
        System.out.println("Name:"+name+",age:"+age);
    }
    public static void main(String[] args) {
        CallAnotherConstructorUsing_this obj=new CallAnotherConstructorUsing_this();

    }
}
