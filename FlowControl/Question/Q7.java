/*Write a program that takes 3 numbers from the user. If the first number is greater than the 3rd number, print the addition
of the 3 numbers. If the 1st number is equal to the 2nd number, make 1st number equal to 3rd number and print the
message ""Kya struggle hai!"". Print the message ""question dhyan se padho""."*/
package ClassPractice.FlowControl.Question;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.print("enter the 1st number:");
        int fn=SC.nextInt();
        System.out.print("enter the 2nd number:");
        int sn=SC.nextInt();
        System.out.print("enter the 3rd number:");
        int tn= SC.nextInt();
        if(fn>tn)
        {
            System.out.println("sum="+(fn+sn+tn));
        }
        if(fn==sn) {
            fn=tn;
            System.out.println("Kya struggle hai!");
        }
        System.out.println("question dhyan sa padho");
    }
}
