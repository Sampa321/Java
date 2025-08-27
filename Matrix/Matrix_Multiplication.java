package ClassPractice.Arrays_String.Matrix;

import java.util.Scanner;

public class Matrix_Multiplication {
        public static void main(String[] args) {
            Scanner SC=new Scanner(System.in);
            System.out.println("---------For Matrix1-------------");
            System.out.println("Enter the row and colum:");
            System.out.print("R1=");
            int R1=SC.nextInt();
            System.out.print("C1=");
            int C1=SC.nextInt();
            System.out.println("---------For Matrix2-------------");
            System.out.println("Enter the row and colum:");
            System.out.print("R2=");
            int R2=SC.nextInt();
            System.out.print("C2=");
            int C2=SC.nextInt();
            if(C1==R2)
            {
                System.out.println("Elements for matrix1:");
                int [][] a=new int[R1][C1];
                for(int i=0;i<a.length;i++)
                {
                    for(int j=0;j<a[i].length;j++)
                    {
                        System.out.print("a["+i+"]"+"["+j+"]=");
                        a[i][j]= SC.nextInt();
                    }
                }
                System.out.println("Elements for matrix2:");
                int [][] b=new int[R2][C2];
                for(int i=0;i<b.length;i++)
                {
                    for(int j=0;j<b[i].length;j++)
                    {
                        System.out.print("b["+i+"]"+"["+j+"]=");
                        b[i][j]= SC.nextInt();
                    }
                }
                int [][] r=new int[R1][C2];
                for(int i=0;i<R1;i++)
                {
                    for(int j=0;j<C2;j++)
                    {
                        for(int k=0;k<R2;k++)
                        {
                            r[i][j]+=a[i][k]*b[k][j];
                        }
                    }
                }
                System.out.println("-----------For Multiplication Matrix-------------------");
                for(int i=0;i<r.length;i++)
                {
                    for(int j=0;j<r[i].length;j++)
                    {
                        System.out.print(r[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            else
            {
                System.out.println("Matrix Multiplication is not possible!");
            }

        }

}
