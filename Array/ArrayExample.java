package PdfNote.Array_String.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        //convert to string
        Arrays.toString(arr);

        //all element will be 12
        //Arrays.fill(arr,12);
        System.out.println(Arrays.toString(arr));

        int []arr1 = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("arr1["+i+"]=");
            arr1[i]=sc.nextInt();
        }
        System.out.println(Arrays.equals(arr,arr1));

        //traverse in array
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
