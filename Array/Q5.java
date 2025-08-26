package ClassPractice.Arrays_String.Array.PracticeArrayQuestion;
//5.Find the frequency of a given element in an array.

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
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
        System.out.println(Arrays.toString(arr));
        //For target element
        System.out.print("Enter your target element:");
        int target=SC.nextInt();
        int frequency=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target)
            {
                frequency++;
            }
        }
        System.out.println(target +" is present "+frequency+" times");
    }
}
