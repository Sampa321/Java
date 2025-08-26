package ClassPractice.Arrays_String.Array.PracticeArrayQuestion;

//7.Find the second largest element in an array.

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
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
        System.out.println("Your original array:"+ Arrays.toString(arr));
        int max1=arr[0];
        int max2=arr[0];
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2)
            {
                max2=arr[i];
            }
        }
        System.out.println("Second largest element:"+max2);
    }
}
