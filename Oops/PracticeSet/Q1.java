package ClassPractice.OOPS.PracticeSet.Qs1;

/*Question 1:  Create a base class Animal with a method makeSound(). Create subclasses Dog, Cat, and Cow that
 override this method. Demonstrate polymorphism by calling the method on different objects through a common
 reference.*/

public class Animal {
    void makeSound(){
        System.out.println("This is makeSound() in amimal class");
    }
}
