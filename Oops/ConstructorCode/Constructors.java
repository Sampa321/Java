package ClassPractice.OOPS.ConstructorsCode.ConstructorMainCode;

public class Constructors {
    String name;
    int age;
    //Same name as class
//    Constructors()   //No return type
//    {
//        System.out.println("Constructor called!");
//    }


    //for constructor,parameter datatype can't same********************************************

    //No parameterized constructors
    Constructors(){
        this.name="Unknown";
        this.age=20;
        System.out.println("name:"+name+",age:"+age);

    }

    //parameterized constructors
    Constructors(String name,int age)
    {
        this.name=name;
        this.age=age;
        System.out.println("My name is:"+name+"\nMy age:"+age);
    }

    public static void main(String[] args) {
       Constructors obj=new Constructors();
        Constructors obj1=new Constructors("sampa",20);
    }
}
