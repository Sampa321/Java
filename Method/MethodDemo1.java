package ClassPractice.Method;

import java.util.Scanner;

public class MethodDemo1 {
    public static int sumToNumber(int a,int b)//parameter
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the value of c:");
        int c=Sc.nextInt();
        a=a+4;//16
        b+=9;//18
        return a+b+c;

    }
    public static void main(String[] args) {
        int a=12;
        int b=9;
        int c=sumToNumber(a,b);//argument
        //we pass primitive type value so cannot change the original value(argument)
        System.out.println("sum of the number :"+c);
        System.out.println("The value of a="+a);
        System.out.println("The value of b="+b);

    }
}
