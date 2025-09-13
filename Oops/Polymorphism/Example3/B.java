package ClassPractice.OOPS.Polymorphism.Example3;

public class B extends A implements InterfaceA,InterfaceB,InterfaceC{
    int b;
    B(){
        super();
       b= 50;
    }
    public void hello(){
        System.out.println("Eita child class e implement korchi.It is actually an abstract method in child class");
    }
    public void hi(){
        System.out.println("Hi!!");
    }
}
