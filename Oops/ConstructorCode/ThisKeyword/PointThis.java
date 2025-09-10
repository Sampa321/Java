package ClassPractice.OOPS.ConstructorsCode.ThisKeyword;

public class PointThis {
    int x,y,z;
    PointThis(int a,int b)
    {
        x=a;
        y=b;
    }
    PointThis(int a,int b,int c)
    {
        this(a,b);
        z=c;
    }
    void display()
    {
        System.out.println("x="+x+",y="+y+",z="+z);
    }
    public static void main(String[] args) {
        PointThis p1=new PointThis(10,5,12);
        p1.display();;
    }
}
