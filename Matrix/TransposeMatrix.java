package ClassPractice.Arrays_String.Matrix;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.print("enter the array size:");
        int n= SC.nextInt();
        int [] [] m= new int [n][n];
        int [] [] t= new int [n][n];
        System.out.println("Enter the matrix elements:");
        for(int i=0;i<n;i++)
        {
            System.out.println("For row"+(i+1)+":");
            for(int j=0;j<n;j++)
            {
                System.out.print("m"+"["+i+"]"+"["+j+"]"+"=");
                m[i][j]=SC.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                t[i][j]=m[j][i];
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
}
