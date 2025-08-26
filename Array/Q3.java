package ClassPractice.Arrays_String.Array.PracticeArrayQuestion;
//3.Reverse an array in place.

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
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
        System.out.println("Original Array:"+Arrays.toString(arr));
        //Approach1


        for(int i=0;i<(n/2);i++) //0,1,
        {
            int temp=arr[i]; //1,2
            arr[i]=arr[n-i-1]; //arr[0]=arr[5-0-1]=5,arr[1]=arr[5-1-1]=4
            arr[n-i-1]=temp; //arr[4]=1,arr[3]=2,
        }

        //Approach2:
        /*int j= arr.length-1;
        int i=0;
        while(i<=j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }*/
        System.out.println("Reverse Array:"+Arrays.toString(arr));
    }
}
