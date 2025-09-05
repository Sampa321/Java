/*QUESTION - write a program that takes the age of the user and his nationality.
If the age >= 18 and nationality is ""Indian"",print ""you can vote"".
 If the age is greater than or equal to 18 but nationality is not equal to ""Indian"", print""bhag yaha se, doosre desh mein ja"".
 If the age is not greater than 18, print ""abhi ghar jaa, bada ho ja, firr aana"""*/
package ClassPractice.FlowControl.Question;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args)
    {
        Scanner SC= new Scanner(System.in);
        System.out.print("Enter the age:");
        int age=SC.nextInt();
        SC.nextLine();
        System.out.println("Enter nationality:");
        String Nationality=SC.next();
        if(age>=18){
            if(Nationality.equalsIgnoreCase("indian"))
            {
                System.out.print("You can vote");
            }
            else
            {
                System.out.print("bhag yaha se,doose desh mein ja");
            }
        }
        else {
            System.out.print("abhi ghar jaa,bada ho ja,firr aana");
        }
    }
}
