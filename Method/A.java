package PdfNote.Method.Q3;

public class A {
    int a;
    int b;
    public void show(){
        System.out.println("Hello");
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.a = 10;
        obj.b=20;
        obj.show();
    }
}
