package ClassPractice.OOPS.Polymorphism.Example2;

public class D extends A implements B,C{
    public void add(){
        System.out.println("This is add() in class D");
    }
    public static void main(String[] args) {
    B obj = new D();
    obj.add();

    }
}
