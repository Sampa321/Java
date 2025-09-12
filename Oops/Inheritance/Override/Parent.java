package ClassPractice.OOPS.Inheritance.Override;

public class Parent {
    int a;     //10
    int b;     //10

    Parent() {
        this.a = 10;
        this.b = 5;
        System.out.println("In parent class - A constructor without any parameters.");
    }

    Parent(int a) {     //10
        this(a,10);    //(10,10)
        System.out.println("In parent class - A constructor with only 1 parameter.\nIt will invoke a constructor with 2 parameters.");
    }

    Parent(int a, int b) {      //(10,10)
        this.a = a;    //10
        this.b = b;      //10
        System.out.println("In parent class - A constructor with 2 parameters.");
        System.out.println("IN parent class. a = " + a);    //10
    }

    int add() {
        System.out.println("In parent class ,value of a:"+a);
        System.out.println("In parent class ,value of b:"+b);
        return a+b;
    }
}
