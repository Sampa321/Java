package ClassPractice.Multithreading.Example2;

public class A implements Runnable{
    public void run(){
        for(int i=0;i<100;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1);
            }catch (Exception e)
            {
                System.out.println("Abar handle hoye jabe!");
            }
        }

    }
    public static void main(String[] args) {

        Thread o2 = new Thread(new A());
        o2.start();

        Thread o3 = new Thread(new B());
        o3.start();

    }
}
