package ClassPractice.OOPS.AnotherExample;

public class Field {
    //static variable (class field)
    static int staticField=10;
    //instance variable(object field)
    int instanceField=20;

    public static void main(String[] args) {
        //Accessing the static field
        System.out.println(Field.staticField); //Recommended way

        Field obj=new Field();
        System.out.println(obj.staticField); //works but not recommended

        //Accessing the instance field
        System.out.println(obj.instanceField);//Requires an object
    }
}
