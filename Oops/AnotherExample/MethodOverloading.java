package ClassPractice.OOPS.AnotherExample;

public class MethodOverloading {
    //Method with one int parameter
    public void display(int a)
    {
        System.out.println("Integer:"+a);
    }
    //Method with one double parameter
    public void display(double a)
    {
        System.out.println("Double:"+a);
    }
    //Overloaded method with two int parameter
     public void display(int a,int b)
    {
        System.out.println(a+"+"+b+"="+(a+b));
    }
    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        obj.display(10);
        obj.display(5.5);
        obj.display(4,5);
    }
}
