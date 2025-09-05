package ClassPractice.FlowControl.Question;
/*Write a java program that takes a number as input and displays its multiplication table upto 10.*/
import java.util.Scanner;

public class Q9 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the multiplication number:");
        int n=sc.nextInt();
        System.out.println("enter the range:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            System.out.println(n+"X"+i+"="+n*i);
        }
    }
}
