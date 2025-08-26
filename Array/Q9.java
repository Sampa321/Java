package ClassPractice.Arrays_String.Array.PracticeArrayQuestion;

//Q9.Find the missing number in an array of consecutive integers.Given an array arr[]of size N-1 with integers in
// the range of[1.N],the task id to find the missing number from the first N integers.

import java.util.Arrays;
import java.util.Scanner;

public class Q9 {
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
        n= n+1;
        int expectedSum=n*(n+1)/2; //10
        int actualSum=0;
        for(int num: arr)
        {
            actualSum+=num;//
        }
        int missingNumber=expectedSum-actualSum;
        System.out.println("Missing Number:"+missingNumber);
    }
}
