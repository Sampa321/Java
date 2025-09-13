package ClassPractice.OOPS.Polymorphism.Example1;

public class ClassB extends ClassA {
    int b;
    ClassB(){
        super();
        b = 10;
    }
    public void hello(){
        System.out.println("This is non abstract method in classB");
    }
    public void hii(){
        System.out.println("wow!");
    }
}
