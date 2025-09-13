package ClassPractice.OOPS.Polymorphism.Example3;

public interface InterfaceB {
    default void add(){
        System.out.println("This is add() in interface B");
    }
}
