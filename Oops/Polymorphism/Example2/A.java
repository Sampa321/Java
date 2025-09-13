package ClassPractice.OOPS.Polymorphism.Example2;

public abstract class A {
    int a;
    A(){
        a=10;
    }
    public abstract void add();

    public static void main(String[] args) {
        B interfaceReference = new D();
        interfaceReference.add();
    }
}
