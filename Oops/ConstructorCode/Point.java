package ClassPractice.OOPS.ConstructorsCode.ConstructorMainCode;

public class Point {
    int x,y,z;
    Point(int a,int b)
    {
        x=a;
        y=b;
        z=0;
    }
    Point(int a,int b,int c)
    {
        x=a;
        y=b;
        z=c;
    }
    void ShowDetails()
    {
        System.out.println("x=" + x + ",Y="+y+",Z="+z);
    }
    public static void main(String[] args) {
        Point p1=new Point(12,23);
        p1.ShowDetails();
        Point p2=new Point(12,23,5);
        p2.ShowDetails();
    }
}
