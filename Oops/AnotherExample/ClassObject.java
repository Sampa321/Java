package ClassPractice.OOPS.AnotherExample;

public class ClassObject {
    //Attributes(variables)
    String color;
    String model;
    int year;

    //method(function)
    void displayDetails()
    {
        System.out.println("Car Model:"+model);
        System.out.println("car Color:"+color);
        System.out.println("car year:"+year);
    }
    public static void main(String[] args) {
        //Creating an object of the class
        ClassObject obj=new ClassObject();

        //Setting attributes of the object
        obj.color="Blue";
        obj.model="BMW i10";
        obj.year=2020;

        //calling the method to display car details
        obj.displayDetails();
    }
}
