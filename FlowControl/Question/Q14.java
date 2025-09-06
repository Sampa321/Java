package ClassPractice.FlowControl.Question;
/*Write a program that takes a number from the user-say 't'.Now,take 't' number of numbers from the user and
for each number,check if it is even or odd.*/
/* t=5
        1.34->even
        2.23->odd
        3.56->even
        4.9->odd
        7->odd
 */

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("enter a number:");
        int t=SC.nextInt();
        //approach 1
        /*int i=1;
        while(i<=t)
        {
            System.out.print("Enter the value of "+i+"=");
            int n= SC.nextInt();
            System.out.println(n%2==0? n+" is even number":n+" is odd number");
            i++;
        }*/
        //Approach 2
        for(int i=1;i<=t;i++) {
            System.out.println("Enter the number:");
            int n = SC.nextInt();
            if (n % 2 == 0) {
                System.out.println(n + " is even number");
            } else {
                System.out.println(n + " is odd number");
            }
        }
    }
}
