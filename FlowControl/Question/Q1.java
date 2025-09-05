/*Write a Java program to take two numbers from user and then print the sum (addition), multiply, subtract,
divide and remainder of two numbers*/
package ClassPractice.FlowControl.Question;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=SC.nextInt();
        System.out.print("Enter the value of b:");
        int b=SC.nextInt();
        System.out.println("sum = "+ (a+b));
        System.out.println("sub = "+(a-b));
        System.out.println("mult = " + (a*b));
        System.out.println("div = "+(a/b));
        System.out.println("mod = "+(a%b));
    }//main() end
}//class end

