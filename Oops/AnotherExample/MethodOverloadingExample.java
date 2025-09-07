package ClassPractice.OOPS.AnotherExample;

public class MethodOverloadingExample {
    int addition(int a)
    {
        System.out.println("Hello");
        return (5+a);
    }
    int addition(int a,int b)
    {
        return a+b;
    }
    float addition(float v1)
    {
        return v1+0.0f;
    }

    public static void main(String[] args) {
        MethodOverloadingExample newOBJ=new MethodOverloadingExample();
        int r1=newOBJ.addition(10);
        System.out.println(r1);
        int r2=newOBJ.addition(12,12);
        System.out.println("value is:"+r2);
        float r3=newOBJ.addition(0.1f);
        System.out.println("Value is:"+r3);
    }
}

