package ClassPractice.OOPS.Polymorphism.InstanceOf;

public class Y extends X{
    public static void main(String[] args) {
        X obj = new X();
       if(obj instanceof Y){
           System.out.println("obj is the object reference of Y ");
       }
        if(obj instanceof X)
       {
           System.out.println("obj is the object reference of X");
       }
    }
}
