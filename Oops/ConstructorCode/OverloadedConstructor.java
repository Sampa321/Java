package ClassPractice.OOPS.ConstructorsCode.ConstructorMainCode;

public class OverloadedConstructor {
    int x;
    int y;
    OverloadedConstructor()
    {
        System.out.println("A no-argument constructor called");
    }
    OverloadedConstructor(int a)
    {
        x=a;
        System.out.println("A constructor with 1 parameter called");
    }
    OverloadedConstructor(int a,int b)
    {
        x=a;
        y=b;
        System.out.println("A constructor with 2 parameters called");
    }
    public void show()
    {
        System.out.println("The attributes of the object are:");
        System.out.println("x="+x+"\ny="+y);
    }
    public static void main(String[] args) {
        OverloadedConstructor obj1=new OverloadedConstructor();
        OverloadedConstructor obj2=new OverloadedConstructor(10);
        OverloadedConstructor obj3=new OverloadedConstructor(10,20);
        obj1.show();
        obj2.show();
        obj3.show();
    }
}
