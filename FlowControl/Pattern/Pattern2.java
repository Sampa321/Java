package ClassPractice.FlowControl.Pattern;
/*
 *
 * *
 * * *
 * * * *
 */
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=SC.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
