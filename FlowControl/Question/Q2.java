/*"Write a program which takes number_of_hours and number_of_minutes as input from user and passes it to a function
which converts the hours and minutes to seconds."*/
package ClassPractice.FlowControl.Question;

import java.util.Scanner;

public class Q2 {
    public static void second(int a,int b)
    {
        int S=(a*3600+b*60);
        System.out.println("SECOND="+S);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the hours:");
        int H=sc.nextInt();
        System.out.print("Enter the minit:");
        int M=sc.nextInt();
//        int second=((H*3600)+(M*60));
//        System.out.println("second="+ second);
        second(H,M);






    }

}
