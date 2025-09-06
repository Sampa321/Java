package ClassPractice.Method;

import java.util.Scanner;

public class OnlineClass {
    public static int AddTwoNumbers(int n) throws ArithmeticException{
        return 5/n;
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = SC.nextInt();
        int b=0;
        try{
            b=AddTwoNumbers(a);
        }
        catch(Exception e)
        {
            System.out.println("we have a problem");
        }
        System.out.println("The calculation:"+b);

    }
}
