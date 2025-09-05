/*Write a program that takes a number from the user and checks:
        if the number is divisible by 5,print "Divisible by 5".
        if the number is divisible by 3 but not 5,print "Divisible by 3".
        if the number is divisible by both 3 and 5,print "Divisible by both".
         if the number is neither divisible by 3 nor 5,print "Not divisible by 3 or 5".
 */

package ClassPractice.FlowControl.Question;

import java.util.Scanner;
public class Q6 {
    //it is right:
    public static void approach1(int n)
    {
        if(n%5==0 && n%3==0)
        {
            System.out.println("Divisible by both");
        } else if (n%3==0 && n%5!=0) {
            System.out.println("Divisible by 3");
        } else if (n%5==0) {
            System.out.println("Divisible by 5");

        }
        else {
            System.out.println("Not divisible by 3 or 5");
        }
    }
    //it is wrong:
    public static void approach2(int n)
    {
        if(n%5==0)
        {
            System.out.println("Divisible by 5");
        } else if (n%3==0 && n%5!=0) {
            System.out.println("Divisible by 3");
        } else if (n%5==0 && n%3==0) {
            System.out.println("Divisible by both");
        }
        else {
            System.out.println("Not divisible by 3 or 5");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        //approach1(a);
        approach2(a);
    }

}
