package ClassPractice.FlowControl.Question;
/*Write a program that takes a number from the user and prints the factorial of that number using do-while loop.
If the user enters a -ve number then print the message - "bhai, kya kar raha hai?". Keep doing it
  until the user enters a +ve number.*/
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        //Approach1
        /*System.out.println("Enter the number:");
        int a=SC.nextInt();
        while (a<0) {
            System.out.println("bhai,kya kar raha hai?");
            System.out.println("Enter +ve number:");
            SC.nextInt();
        }
        int fact=1;
        int t=a;
        while(a>=1)
        {
            fact*=a;
            a--;
        }
        System.out.println("Factorial of "+ t +"="+fact);*/

        //Approach2
        /*int n;
        do{
            System.out.println("Enter a number:");
            n=SC.nextInt();
            if(n<0)
            {
                System.out.println("bhai,kya kar raha hai?");
                System.out.println("Enter +ve Number:");
                SC.nextInt();
            }
            else {
                int fact=1;
                int t=n;
                while(n>=1)
                {
                    fact*=n;
                    n--;
                }
                System.out.println("Factorial of "+ t +"="+fact);
            }
        }
        while(n<0);*/
        //approach 3
        System.out.print("Enter the n:");
        int n= SC.nextInt();
        factorial(n);
    }
    public static void factorial(int n)
    {
        if(n>=0)
        {
            int fact=1;
            int i=1;
            while (i<=n) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of "+n+"="+fact);
        }

        else {
            System.out.println("BHAI,Kya kar raha ha?");
            System.out.println("Enter a +ve number:");
            Scanner SC=new Scanner(System.in);
            n= SC.nextInt();
            factorial(n);
        }
    }
}
