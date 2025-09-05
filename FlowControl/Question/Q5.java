/*"Write a program that takes a number from the user and check - if the number is greater than 30, print ""I am creating list""
if the number is less than 30 but greater than 20, print ""just joking"". if the number is less than 20 but greater than 7, print
""hello world"". If the number is less than 7 print ""arghhh, this is annoying""."*/
package ClassPractice.FlowControl.Question;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        if(n>30)
        {
            System.out.print("I am creating list");
        } else if (n<30 && n>20)
        {
            System.out.print("Just joking");
        } else if (n<20 && n>7)
        {
            System.out.print("hello world");
        }
        else if(n<7) {
            System.out.print("arghhh,this is annoying");
        }

    }
}
