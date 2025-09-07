package ClassPractice.Multithreading.Example1;

public class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++)
        {
            System.out.println("Hii");
        }
    }

    public static void main(String[] args) {
        A o1 = new A();
        o1.start();

        B o2 = new B();
        o2.start();
    }
}
