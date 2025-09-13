package ClassPractice.OOPS.Polymorphism.Example3;

public interface InterfaceA {
    default void add(){
        System.out.println("Add() in interface A");
    }
}
