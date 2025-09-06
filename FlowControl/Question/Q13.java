package ClassPractice.FlowControl.Question;
/*WAP that takes a number from user and checks if it is a perfect number or not.*/
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=SC.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
//        if(sum==n)
//        {
//            System.out.println(n+" is perfect number");
//        }
//        else {
//            System.out.println(n+" is not perfect number");
//        }
        System.out.println(sum==n? n+" is perfect number":n+" is not perfect number");
    }
}
