package ClassPractice.Arrays_String.Array;

import java.util.Arrays;

public class RotateBackside {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int k=2;
        //Approach1:
        for(int i=0;i<k;i++)//3
        {
            int temp=arr[arr.length-1];//7
            for(int j=(arr.length-1);j>0;j--)//6-----0
            {
                arr[j]=arr[j-1];//arr[6]=6,arr[5]=5,arr[4]=4,arr[3]=3,arr[2]=2,arr[1]=1
            }
            arr[0]=temp;//7
        }
        System.out.println(Arrays.toString(arr));
    }
}
