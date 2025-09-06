package ClassPractice.FlowControl.Question;
/*Write a program that takes a number from the user. If the number is smaller than 43,
 tell the user to enter a number again. Keep doing it until he enters a number greater than or equal to 43.
  After getting the appropriate number, find the total number of factors of the input number except itself and
  print if it is an even number or odd number.
 */
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args)
    {
        Scanner SC= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=SC.nextInt();
        while(n<43)
        {
            System.out.println("Enter the greatest or equal number of 43:");
            n = SC.nextInt();
        }
        int sum=0;
        for(int i=1;i<n;i++)//1,3,5,15,25,
        {
            if(n%i==0)//75%5==0
            {
                sum+=1;//5
            }
        }
        if(sum%2==0)
        {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
