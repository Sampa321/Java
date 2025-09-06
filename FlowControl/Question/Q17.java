package ClassPractice.FlowControl.Question;

/*Write a Java program to reverse a given number using a while loop.

Example Input: 12345
Example Output: 54321*/

import java.util.Scanner;

//2035=2*1000+0*100+3*10+5;
//5302=5*1000+3*100+0*10+2*1;
public class Q17 {
    public static void main(String[] args)
    {
        int reverse=0,temp;
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=SC.nextInt();
        //Approach1:

       /* temp=n;
        while(n!=0)
        {
            int r=n%10; //5,4,3,2,1
            reverse=reverse*10+r;//5,54,543,5432,54321
            n/=10;//1234,123,12,1

        }
        System.out.println("Original number"+temp);
        System.out.println("Reverse number="+reverse);*/

        //Approach2:
        StringBuilder InttoStr=new StringBuilder(Integer.toString(n));//12345
        InttoStr.reverse();
        System.out.println(InttoStr);
    }
}
