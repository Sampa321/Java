package ClassPractice.FlowControl.Pattern;

/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

import java.util.Scanner;

public class P5 {
    public static void main(String[] args){
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the range:");
        int r=SC.nextInt();
        //Approach1
        for(int i=0;i<r;i++)//0,1,2,3,4
        {
            for(int j=1;j<=(r-i);j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Approach2
        /*for(int i=r;i>=1;i--)//5,4,3,2,1
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        //Approach3
        /*for(int i=1;i<=r;i++)
        {
            int count=1;
            for(int j=i;j<=r;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }*/


    }
}
