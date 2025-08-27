package ClassPractice.FlowControl.Pattern;
/*
         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
 */

import java.util.Scanner;

public class P6 {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the range:");
        int r=SC.nextInt();
        for(int i=1;i<=r;i++)//1,9
        {
            for(int j=1;j<=(r-i);j++)//
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=(r-i);j++)//
            {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
