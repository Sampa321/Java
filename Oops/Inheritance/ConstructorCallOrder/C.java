package ClassPractice.OOPS.Inheritance.ConstructorCallOrder;

public class C extends B{
    C(){
        super();
        System.out.println("THis is C class constructor");
    }

    public static void main(String[] args) {
        C obj=new C();
    }
}
