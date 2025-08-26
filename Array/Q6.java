package ClassPractice.Arrays_String.Array.PracticeArrayQuestion;
//6.Sort an array in ascending order using bubble sort.
import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
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
       System.out.println("Before sorting,Your array:"+Arrays.toString(arr));

        //Approach1:
        /*for(int i=0;i<n-1;i++) //0,1,----5
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting,Your array:"+Arrays.toString(arr));*/

     //Approach2:
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After sorting,Your array:"+Arrays.toString(arr));
    }
}
