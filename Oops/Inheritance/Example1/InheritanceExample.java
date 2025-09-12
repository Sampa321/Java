package ClassPractice.OOPS.Inheritance.Example1;

public class InheritanceExample {
    public static void main(String[] args) {
        //create an object of the dog class
        Dog dog=new Dog();
        //call methods from both the parent and child classes
        dog.eat(); //Inherited method from animal class
        dog.berk();  //method from dog class
    }
}
