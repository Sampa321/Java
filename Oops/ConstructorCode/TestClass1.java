package ClassPractice.OOPS.ConstructorsCode.ConstructorMainCode;

public class TestClass1 {
    //data members or fields
    int x;
    String abc;
    char c;
    //parameterized constructors
    TestClass1(int a)
    {
        x=a;
        abc="Testing parameterized constructor";
        c='B';
    }
    //Another parameterized constructor.This is an "overloaded" constructor
    TestClass1(String a,char d)
    {
        abc=a;
        c=d;
    }
    //A member function of a class
    void showDetails(){
        System.out.println("Displaying the fields of the object:");
        System.out.println("int x="+x);
        System.out.println("String s="+abc);
        System.out.println("char c="+c);
    }
    public static void main(String[] args) {
        TestClass1 obj1=new TestClass1(10);
        obj1.showDetails();
        System.out.println();
        TestClass1 obj2=new TestClass1("My name is sampa",'e');
        obj2.showDetails();
    }
}
