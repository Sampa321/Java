package ClassPractice.Method;

import java.util.Scanner;

public class MethodDemoExceptionHandling {
    public static int sumTwoNumber(int a,int b) throws Exception
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the value of c:");
        int c=SC.nextInt();
        a+=5;//17
        b=b+4;//9
        return a+b+c;
    }
    public static void main(String[] args) {
        int a=12;
        int b=5;
        try{
            int r=sumTwoNumber(a,b);
            System.out.println("The sum of the number="+r);
        }
        catch(Exception busno81)
        {
            System.out.println(("We can face some problem so,we take terminate program"));
        }
        System.out.println("Program ends!");
    }
}
