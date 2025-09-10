package ClassPractice.OOPS.ConstructorsCode.ThisKeyword;

public class CallingMethods {
    //Instance variable
    int x;
    int y;
    //no-argument constructor
    CallingMethods(){
        this(3,4);
        System.out.println("Calling a no-argument constructor");
    }
    CallingMethods(int x,int y)
    {
        this.x=x;
        this.y=y;
        System.out.println("Calling two argument constructors");
    }
    static void add(){
        System.out.println("This is static add function");
    }
    void add(CallingMethods obj2)
    {
        add();
        this.add(4,5);

        System.out.println( this.x+this.y);
    }
    void add(int x,int y)
    {
        System.out.println(this.x+this.y);

    }
    public static void main(String[] args)
    {
        CallingMethods obj1=new CallingMethods();
        CallingMethods obj2=new CallingMethods();
        obj1.add(obj2);
    }
}
