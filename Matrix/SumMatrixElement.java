package ClassPractice.Arrays_String.Matrix;

import java.util.Scanner;

public class SumMatrixElement {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = SC.nextInt();
        int[][] m1 = new int[n][n];
        int[][] m2 = new int[n][n];
        int[][] r = new int[n][n];
        System.out.println("Enter the 1st matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("m1" + "[" + i + "]" + "[" + j + "]" + "=");
                m1[i][j] = SC.nextInt();
            }
        }
        System.out.println("Enter the 2nd matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("m2" + "[" + i + "]" + "[" + j + "]" + "=");
                m2[i][j] = SC.nextInt();
            }
        }
        System.out.println("Matrix sum:");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                r[i][j] = m1[i][j] + m2[i][j];
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
}
