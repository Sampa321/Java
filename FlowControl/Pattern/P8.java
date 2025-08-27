package ClassPractice.FlowControl.Pattern;
/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */
import java.util.Scanner;

public class P8 {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the range:");
        int r=SC.nextInt();
        for(int i=1;i<=r;i++)
        {
            int k=i%2==0?0:1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k=k==0?1:0;

            }
            System.out.println();
        }
    }
}
