package ClassPractice.OOPS.ConstructorsCode.ThisKeyword;

public class ExampleB {
    public static int rainyDay(int v1, int v2)
    {
        System.out.println("This is method body");
        System.out.println("It is public method.It is static method.");
        return v1+v2;
    }
    float SunnyDay(){
        System.out.println("This is sunny day method");
        return 0.0f;
    }
    public static void main(String[] args) {
        int store_value=ExampleB.rainyDay(4,5);
        System.out.println("Value is:"+store_value);
        ExampleB b=new ExampleB();
        System.out.println(b.rainyDay(4,5));

        //ExampleB.SunnyDay();  //Non-static method 'SunnyDay()' cannot be referenced from a static context
        ExampleB newB=new ExampleB();
        System.out.println(newB.SunnyDay());
    }
}
