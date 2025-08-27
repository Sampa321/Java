package ClassPractice.Arrays_String.Matrix;

//1.Create a 2X2 matrix and display its elements.

public class DisplayElement {
    public static void main(String[] args) {
        int [] [] matrix={
                {1,2},
                {4,5}
        };
        System.out.println("Matrix elements:");
        for(int i=0;i< matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
