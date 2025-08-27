package ClassPractice.Arrays_String.Matrix;

//2.Add two 2x2 matrices.

public class AddTwoMatrix {
    public static void main(String[] args) {
        int [][] Matrix1={
                {1,2},
                {3,4}
        };
        int [] [] Matrix2={
                {5,6},
                {7,8}
        };
        int [] [] sum=new int[2][2];
        System.out.println("Sum of the matrices:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                sum[i][j]=Matrix1[i][j]+Matrix2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

    }
}
