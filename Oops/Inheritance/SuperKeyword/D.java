package ClassPractice.OOPS.Inheritance.SuperKeyword;

public class D extends C{
     int a;
    int value;
    D(int a,int b,int c)
    {
        super(a,b);
        this.value=c;
        System.out.println("Constructor of chile class invoked");
        System.out.println("Value of property 'a' of child class:"+this.a);
        System.out.println("Value of property 'a' of parent class:"+super.a);

    }
    public static void main(String[] args) {
        D mouse=new D(2,3,4);
        mouse.add(4);
        System.out.println(mouse.a);
    }
}
