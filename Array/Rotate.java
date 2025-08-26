package ClassPractice.Arrays_String.Array;
// nums=[1,2,3,4,5,6,7]
//I/O=[2,3,4,5,6,7,1],key=1;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate {
    //helper function
    public static void reverse(int [] arr,int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
//        int [] arr={1,2,3,4,5,6,7};
//        int k=2;

        //Approach 1:

        /*for(int i=0;i<k;i++)
        {
            int temp=arr[0];//7
            for(int j=0;j<(arr.length-1);j++)
            {
                arr[j]=arr[j+1];//arr[0]=2,arr[1]=3,arr[2]=4,arr[3]=5,arr[4]=6,arr[5]=7,arr[6]=7
            }
            arr[arr.length-1]=temp;
        }
        System.out.println(Arrays.toString(arr));*/


        //Approach 2:
        /*int [] temp1=new int[arr.length];
        int tempv=0;
        for(int i=k;i< arr.length;i++)
        {
           temp1[tempv++]=arr[i];
        }
        for(int i=0;i<k;i++)
        {
            temp1[tempv++]=arr[i];
        }

        for(int i=0;i< arr.length;i++)
        {
           arr[i]=temp1[i];
        }
        System.out.println(Arrays.toString(arr));*/

        //Approach3:


        System.out.println("Enter the size of an array:");
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = SC.nextInt();
        }
        System.out.println("Enter the times you want to rotate the array:");
        int k = SC.nextInt();
        if (k > n) {
            k %= n;
        }
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}
