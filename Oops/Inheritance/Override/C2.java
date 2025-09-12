package ClassPractice.OOPS.Inheritance.Override;

public class C2 extends C1{
    int d;     //10
    C2(int a) {       //a = 15
        super(a);   //c1 class call
        this.d = super.a;  //10
        System.out.println("In c2 class ,the value of d is="+this.d); //10
        System.out.println("C2 child class - constructor called.");
    }

    @Override
    int add() {
        return 0;
    }

    public static void main(String[] args) {
        C2 obj1 = new C2(15);
        System.out.println();
        C1 obj2=new C1();
        System.out.println();
        System.out.println(obj1.add()); //0
        System.out.println();
        System.out.println("In c2 class,the value of a="+obj1.a); //10
        System.out.println("In c2 class,the value of c="+obj1.c); //15
        System.out.println();
        System.out.println(obj2.add());
        System.out.println();
        C1 obj3=new C1(1,23);
        System.out.println(obj3.add());
    }
}
