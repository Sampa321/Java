package ClassPractice.OOPS.PracticeSet.Qs1;

public class Polymorphism {
    public static void main(String[] args) {
         Animal animal  = new Animal();
         animal.makeSound();

         animal = new Dog();
         animal.makeSound();

         animal = new Cow();
         animal.makeSound();

         animal = new Cat();
         animal.makeSound();
    }
}
