package ClassPractice.OOPS.Inheritance.Example2;

public class A {
    int a;
    int b;
    A(int a)
    {
        this.a=a;
    }
    public static void main(String[] args) {
        A obj=new A(5);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
