package ClassPractice.OOPS.Polymorphism.Example3;

public interface InterfaceC extends InterfaceA{
    default void add(){
        System.out.println("This is add() in interface C");
    }
}
