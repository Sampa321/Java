package ClassPractice.Multithreading.Example2;

public class B implements Runnable{
    public void run(){
        for(int i=0;i<100;i++)
        {
            System.out.println(i);
        }
    }
}
