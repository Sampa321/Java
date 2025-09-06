package ClassPractice.Method;
//Instance method
public class A {
    int a;
    int b;
    public void add(){
        System.out.println("sum:"+(a+b));
    }

    public static void main(String[] args) {
        A obj1=new A();
        obj1.a=100;
        obj1.b=50;
        obj1.add();
    }
}                

