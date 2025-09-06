package ClassPractice.FlowControl.Question;

/*QUESTION - Write a program to take a positive number from the user and find the digit root of the number.
The digit root of a number is obtained by repeatedly summing its digits until a single-digit number is obtained.

Input: N = 9875
Output: 2
Explanation: 9+8+7+5 = 29, 2+9=11,1+1=2*/


import java.util.Scanner;
public class Q19 {
    public static int digitSum(int n)
    {
        int sum=0;
        while (n!=0)
        {
            int r=(n%10);
            sum+=r;
            n/=10;
        }
        return sum;
    }
    public static int digitCount(int n)
    {
        int digit=0;
        while(n!=0)
        {
            int r1=(n%10);//5,7,8,9
            digit+=1;//1,2,3,4
            n/=10;//987,98,9,0
        }
        return digit;
    }
    public static void main(String[] args)
    {

        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= SC.nextInt();//9875
        int temp=n;//9875

        int dg=digitCount(temp);//4

        while (dg>1)//true
        {
            temp=digitSum(temp);//
            dg=digitCount(temp);

        }
        System.out.println(temp);
    }
}
