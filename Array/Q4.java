package ClassPractice.Arrays_String.Array.PracticeArrayQuestion;
//4.Check if an array contains a given element.


import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
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
        boolean found=false;
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target) {
                found=true;
                index=i;
                break;
            }

        }
        if(found)
        {
            System.out.println(target+" is found at index "+index);
        }
        else {
            System.out.println(target+" is not found");
        }

    }
}
