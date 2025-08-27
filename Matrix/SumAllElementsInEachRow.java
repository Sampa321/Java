package ClassPractice.Arrays_String.Matrix;

//6.Calculate and print the sum of elements in each row.

public class SumAllElementsInEachRow {
    public static void main(String[] args) {
        int [] [] matrix={
                {5,3,2},
                {7,6,8},
                {4,9,1}
        };
        int sum;
        for(int i=0;i<matrix.length;i++)
        {
            sum=0;
            for(int j=0;j< matrix[i].length;j++)
            {
                sum+=matrix[i][j];

            }
            System.out.println("Sum of elements in row"+i+1+":"+sum);
        };
    }
}
