package ClassPractice.Arrays_String.Array.PracticeArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

//1.Given an array of integers,find the sum of all elements.
public class QS1 {
    public static void main(String[] args)
    {
        //For User Input:
        Scanner SC = new Scanner(System.in);
        System.out.print("Size of an array:");
        int n = SC.nextInt();
        int arr[] = new int[n];
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr["+i+"]=");
            arr[i] = SC.nextInt();
        }
        //print array
        System.out.println(Arrays.toString(arr));
        int sum=0;
        //Approach 1:
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum of array element : "+sum);

        //Approach 2:
        /*for(int num:arr)
        {
            sum+=num;
        }
        System.out.println("Sum of element : "+sum);*/

        //APPROACH 3:
        /*int i=0;
        while (i< arr.length)
        {
            sum+=arr[i];
            i++;
        }
        System.out.println(sum);*/

        //Approach 4:
        /*int i=0;
        do{

            sum+=arr[i];
            i++;
        }
        while (i< arr.length);

        System.out.print("sum of elements="+sum);*/


    }
}
