/*Write a program to take 2 integer values ( years and months ) for age of a person and calculate how many days
he has lived. Use 365 days for each year and 30 days for each month. Print the age in number of days.*/
package ClassPractice.FlowControl.Question;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.print("enter the year:");
        int y=SC.nextInt();
        System.out.print("Enter the months:");
        int M=SC.nextInt();
        int days=(y*365)+(M*30);
        System.out.println("days="+days);

    }
}
