package ClassPractice.OOPS.ConstructorsCode.ConstructorMainCode;

public class ConstructorOverloading {
    ConstructorOverloading (int a)
    {
        System.out.println("value is :"+a); //We can't return anything
    }
    ConstructorOverloading(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        ConstructorOverloading o1=new ConstructorOverloading(10);
        ConstructorOverloading o2=new ConstructorOverloading(10,20);
    }
}
