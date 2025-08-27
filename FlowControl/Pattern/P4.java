package ClassPractice.FlowControl.Pattern;
/*
 * * * * *
 * * * *
 * * *
 * *
 *
 */
import java.util.Scanner;

public class P4 {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the range:");
        int r=SC.nextInt();
        //Approach1
        for(int i=1;i<=r;i++)
        {
            for(int j=i;j<=r;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Approach2
       /* for(int i=r;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/
    }
}
