package ClassPractice.FlowControl.Question;

import java.util.Scanner;
/*Find prime numbers from 1 to 50*/
public class Q18 {
    public static void main(String[] args)
    {
        boolean flag;
        int i=2;
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter range:");
        int r= SC.nextInt();
        System.out.println("Prime number between 1 to 50:");
        while (i<r)
        {
            flag=true;
            for(int j=2;j<i;j++){
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
