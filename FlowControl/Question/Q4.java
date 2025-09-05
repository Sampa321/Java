/*Write a program that takes a input from the user and then check if the number is greater than 10, print
 "I am awesome!". If the number is not greater than 10, print "I am one of a kind!". Regardless of the value,
  print "Testing your knowledge"*/
package ClassPractice.FlowControl.Question;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter the number:");
        int N=SC.nextInt();
        if(N>10)
        {
            System.out.println("I am awesome!");
        }
        else {
            System.out.println("I am one of a kind!");
        }
        System.out.print("Testing your knowledge");
    }
}
