package ClassPractice.OOPS.Inheritance.Override;

public class C1 extends Parent {
    int c;     //15

    C1(int a) {      //a=15
        super(10,10);
        this.c = a; //15
        System.out.println("Child class - constructor with 1 parameter.");
        System.out.println("In C1 class, value of property c = " + c);
    }

    C1() {
        super(10);

        this.c = super.a;
        System.out.println("Child class - constructor with 0 parameters. It calls constructor with 1 parameter.");
    }

    C1(int a,int b)    //(1,23)
    {
        super();
        System.out.println("child class - constructor with 2 parameter");
    }

    int add() {
        System.out.println("In c1 class,the value of super.a="+super.a);
        System.out.println("In c1 class ,the value of c="+c);
        return super.a + c;
    }
}

