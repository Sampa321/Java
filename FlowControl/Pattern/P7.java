package ClassPractice.FlowControl.Pattern;
/*
 * * * * * * * * *
   * * * * * * *
    * * * * *
      * * *
        *
 */


import java.util.Scanner;

public class P7 {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number:");
        int r=SC.nextInt();
        for(int i=r;i>=1;i--)
        {
            for(int j=(r-i);j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("* ");
            }
            for(int j=(r-i);j>=1;j--)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
