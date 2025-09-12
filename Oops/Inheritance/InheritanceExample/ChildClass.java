package ClassPractice.OOPS.Inheritance.InheritanceExample;

public class ChildClass extends ParentClass {

    ChildClass(){
        super();
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        System.out.println("a = " + child.a);
        System.out.println("b = " + child.b);
    }
}
