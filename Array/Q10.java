package ClassPractice.Arrays_String.Array.PracticeArrayQuestion;
//10.Rotate an array by k positions to the right.

import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
    public static void reverse(int[] arr,int start,int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        System.out.print("enter the size of an array:");
        Scanner SC=new Scanner(System.in);
        int n=SC.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=SC.nextInt();
        }
        System.out.print("Enter the number of times you want to rotate the array:");
        int k=SC.nextInt();
        // Helper function to reverse a subarray
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        System.out.println(Arrays.toString(arr));

    }


}
