package ClassPractice.FlowControl.Question;
/*Write a program that takes a number from the user - say 't'. Now, take 't' number of numbers from the user and
print it's factors which are greater than 23. If the user enters a number less than 81, prompt the user again to
 enter the correct number.*/


import java.util.Scanner;

public class Q15 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int t=sc.nextInt();
        int i=1;
        while(i<=t)
        {
            System.out.println("Enter the value of "+i);
            int a=sc.nextInt();
            while (a<81)
            {
                System.out.println("Enter no >81:");
                a=sc.nextInt();
            }
            for(int j=23;j<=a;j++)
            {
                if(a%j==0)
                {
                    System.out.println(j);
                }

            }


            i++;
        }
    }
}
