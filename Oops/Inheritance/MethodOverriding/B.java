package ClassPractice.OOPS.Inheritance.MethodOverriding;

public class B extends A{
    @Override
    void job()
    {
        System.out.println("Data Science");
    }

    public static void main(String[] args) {
        A obj1=new A();
        obj1.job();  //Full stack development

        B obj2=new B();
        obj2.job(); //data Science

        A obj3=new B();
        obj3.job(); //Data Science
    }
}
