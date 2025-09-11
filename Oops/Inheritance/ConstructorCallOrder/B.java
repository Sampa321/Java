package ClassPractice.OOPS.Inheritance.ConstructorCallOrder;

public class B extends A {
    int a;
    int b;
    B()
    {
        super();
        this.b=10;

        System.out.println("THis is B class constructor");
    }
}
