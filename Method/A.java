package PdfNote.Method.Q4;

public class A {
    int a, b;
    public void show(){
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj.a=10;
        obj.b=obj.a;
        obj.show();
        obj.b=20;
        obj.show();
        A obj2 = obj;
        obj2.a=5;
        obj2.b= obj2.a;
        obj2.show();
    }
}
