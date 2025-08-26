package ClassPractice.Arrays_String.Array.PracticeArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

//2.Find the maximum and minimum elements in an array.
public class Qs2 {
    public static void main(String[] args) {
        //For User Input:
        Scanner SC = new Scanner(System.in);
        System.out.println("Size of an array:");
        int n = SC.nextInt();
        int arr[] = new int[n];
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr["+i+"]=");
            arr[i] = SC.nextInt();
        }
        //print array
        System.out.println(Arrays.toString(arr));
        int max=arr[0];
        int min=arr[0];

        //Approach 1:
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            if(min>arr[i])
            {
                min=arr[i];
            }
        }

        //Approach 2:
        /*for(int num:arr)
        {
            if(max<num)
            {
                max=num;
            }
            if(min>num)
            {
                min=num;
            }
        }*/

        //Approach 3
        /*int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++)
        {
            max=arr[i]>max?arr[i]:max;
            min=arr[i]<min?arr[i]:min;
        }*/
        System.out.println("Maximum element="+max);
        System.out.println("Minimum elements="+min);
    }
}
