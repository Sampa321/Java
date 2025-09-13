package ClassPractice.OOPS.Polymorphism.Example3;

public abstract class A {
    int a;
    A(){
        a = 10;
        System.out.println("Abstract class constructor method");
    }

    //abstract method
    public abstract void hello();

    //concrete method
    public void details(){
        System.out.println("This is abstract class -A.It has a field 'a' with value"+a);
    }

    // If you don't override add() of interfaceA() and interfaceB(),It will given an error
    public void add(){
        System.out.println("This is add() of parent class.");
    }

    public static void main(String[] args) {
        A parentReference = new B();
        System.out.println(parentReference.a);
       // System.out.println(parentReference.b);   //error only access parent class property
        parentReference.add();
        parentReference.details();
        //parentReference.hi(); ////error only access parent class property
        parentReference.hello();
        System.out.println();

        B childReference = new B();
        System.out.println(childReference.a);
        System.out.println(childReference.b);
        childReference.hello();
        childReference.hi();
        childReference.add();
        childReference.details();
        System.out.println();

        InterfaceC interfaceReference = new B();
        interfaceReference.add();

    }
}
