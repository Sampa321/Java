package ClassPractice.FlowControl.Pattern;
/*
 * * * *
 * * * *
 * * * *
 * * * *
 */

import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args){
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the range:");
        int r=SC.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
