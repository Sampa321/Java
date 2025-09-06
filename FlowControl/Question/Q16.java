package ClassPractice.FlowControl.Question;
/*Write a Java program to count the number of even and odd digits in a given number using a while loop.

Example Input: 123456789
Example Output:
Even digits: 4
Odd digits: 5*/


import java.util.Scanner;
public class Q16 {
    //Approach1:Using % operation,take out the last digit,check if it even or odd.
    //finally,divide the input number by 10.
    /*public static void Approach1(int a)
    {
        int even_digit=0,odd_digit=0;
        while (a!=0)
        {
            int r=(a%10);
            if(r%2==0)
            {
                even_digit+=1;
            }
            else {
                odd_digit+=1;
            }
            a/=10;
        }
        System.out.println("Even digit="+even_digit);
        System.out.println("Odd digit="+odd_digit);
    }*/
    //Approach2:Convert the input to a string.then,run a while loop,and keep checking each character type cast the
    // character to integer and then check if it is an even or odd number.
    public static void Approach2(int a)
    {
        int even_digit=0,odd_digit=0;
        String temp=Integer.toString(a);
        for(int i=0;i<temp.length();i++) {
            String tempCharacter = String.valueOf(temp.charAt(i));
            if (Integer.parseInt(tempCharacter) % 2 == 0) {
                even_digit++;
            } else {
                odd_digit++;
            }
        }
        System.out.println("Total number of even digit:"+even_digit+"\nTotal number of odd digit:"+odd_digit);
    }
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=SC.nextInt();
        //Approach1(a);
        Approach2(a);
    }
}
