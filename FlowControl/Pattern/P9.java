package ClassPractice.FlowControl.Pattern;

import java.util.Scanner;

/*
1        1
12      21
123    321
1234  4321
1234554321
 */
public class P9 {
    public static void main(String[] args) {
        Scanner SC= new Scanner(System.in);
        System.out.println("Enter the range:");
        int n= SC.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(j);
            }
            for(int j=1;j<=(2*i);j++)
            {
                System.out.print(" ");
            }
            for(int j=(n-i);j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
