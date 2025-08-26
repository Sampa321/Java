package ClassPractice.Arrays_String.Array.PracticeArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

//8.Check if an array is sorted in ascending order.
public class Q8 {
     public static void main(String[] args) {
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
         boolean sorted=true;
         //For ascending order
         for(int i=0;i<arr.length-1;i++)
         {
             if(arr[i]>arr[i+1])
             {
                 sorted=false;
                 break;
             }
         }

         //For descending order
         /*for(int i=1;i<arr.length;i++)
         {
             if(arr[i-1]<arr[i])
             {
                 sorted=false;
                 break;
             }
         }*/

         if(sorted)
         {
             System.out.println("Array is sorted.");
         }
         else {
             System.out.println("Array is not sorted.");
         }
     }
}
