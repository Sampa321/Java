package ClassPractice.FlowControl.Pattern;
/*
Print the following pattern:
when n=5
*
* *
*   *
*      *
* *  *  *  *
 */


import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j==1 || (i==j) || (i==n))
                {
                    System.out.print("* ");
                }
                else if(j>i)
                {
                    continue;
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
