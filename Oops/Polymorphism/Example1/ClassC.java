package ClassPractice.OOPS.Polymorphism.Example1;

public class ClassC {
    public static void main(String[] args) {
        ClassA obj = new ClassB();
        System.out.println( obj.a);
        obj.hello();
        //System.out.println(obj.b);        //error,because classB property cannot access classA object reference
//        obj.hii();     //error,because classB property cannot access classA object reference
    }
}
