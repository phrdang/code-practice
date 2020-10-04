package Amaan;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Adapted from Exercise 8.5,
 * Introduction to Java Programming (Comprehensive)
 * by Y. Daniel Liang, 10th ed.
 *
 * Create a program called AddMatrices which
 * adds two 3x3 matrices and prints the result.
 * The program should prompt the user to enter
 * data for 2 matrices and then displays those
 * 2 matrices and the sum matrix.
 *
 * Example output:
 *
 * Enter matrix1: 1 2 3 4 5 6 7 8 9
 * Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2
 * The matrices are added as follows
 * 1.0 2.0 3.0     0.0 2.0 4.0     1.0 4.0 7.0
 * 4.0 5.0 6.0  +  1.0 4.5 2.2  =  5.0 9.5 8.2
 * 7.0 8.0 9.0     1.1 4.3 5.2     8.1 12.3 14.2
 *
 * Hint: You may need to use the Double.parseDouble("a string")
 * to convert the user input to doubles.
 */

public class MatrixMult {


    public static void main(String[] args) {

        System.out.println("Matrix A");
        double[][] testMatrix = getMatrix();
//        System.out.println(Arrays.deepToString(testMatrix));

        System.out.println();

        System.out.println("Matrix B");
        double[][] testMatrix2 = getMatrix();

//        System.out.println(Arrays.deepToString(multiplyMatrix(testMatrix, testMatrix2)));

        System.out.println("Matrix A * B is:");
        prettyPrintMatrix(multiplyMatrix(testMatrix, testMatrix2));

        System.out.println();

        System.out.println("Matrix A + B is:");
        prettyPrintMatrix(multiplyMatrix(testMatrix, testMatrix2));
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);

        int rows, cols;

        System.out.print("Enter number of rows: ");
        rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        cols = input.nextInt();

        double[][] res = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                res[i][j] = input.nextDouble();
            }
        }
        return res;
    }

/*    public static double[][] multiplyMatrix(double[][] A, double[][] B) {
        double[][] res = new double[5][5];

        System.out.println("Rows: " + A.length + ", Cols: " + B[0].length);

        for (int out = 0; out < 1; out++) {
            for (int row = 0; row < A.length; row++) {
                double sum = 0;
                int col;
                for (col = 0; col < B.length; col++) {
                    System.out.print("A[" + row + "][" + col + "] = ");
                    System.out.println(A[row][col]);
                    System.out.print("B[" + col + "][" + row + "] = ");
                    System.out.println(B[col][row]);
                    sum += A[row][col] * B[col][row];
                }
                System.out.println("sum = " + sum);
                System.out.println("row = " + row);
                System.out.println("col = " + col);
                // 1 3 3 4 2 3 4 13 9 7 15 8 7 4 6 6 4 0 3
                // res[0][0]
//            res[row][col] = sum;
                *//*
                 * A.length = 1
                 * A[0].length = 3
                 * B.length = 3
                 * B[0].length = 4
                 * A[0][0] * B[0][0] + A[0][1] * B[1][0] + A[0][2] * B[2][0]
                 * first part of index is B.length
                 * second part is A.length
                 * *//*
            }
        }

        return res;
    }*/

    public static double[][] multiplyMatrix(double[][] A, double[][] B) {
        double[][] res  = new double[A.length][B[0].length];

        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < B[0].length; col++) {
//                System.out.println("dotProd of A at row " + row + " and B at col " + col + " = " + dotProd(A[row], getMatrixColumn(B, col)));
                res[row][col] = dotProd(A[row], getMatrixColumn(B, col));
            }
        }
        return res;
    }

    public static double dotProd(double[] a, double[] b) {
        double prod = 0;
        for (int i = 0; i < a.length; i++) {
            prod += a[i] * b[i];
        }

        // A: 1 2 3
        // B: 7 9 11
        /*
        * prod = 0
        * prod = 8
        * prod = 26
        * prod = 58
        * */

        return prod;
    }

    public static double[][] addMatrix(double[][] A, double[][] B) throws Exception {
        // check if they don't have same # of rows and columns
        if (A.length != B.length || A[0].length != B[0].length) {
            throw new Exception("Cannot add matrices of different sizes");
        }

        double[][] res = new double[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                res[i][j] = A[i][j] + B[i][j];
            }
        }

        return res;
    }

    public static double[] getMatrixColumn(double[][] matr, int col) {
        double[] res = new double[matr.length];

        for (int i = 0; i < matr.length; i++) {
            res[i] = matr[i][col];
        }

        return res;
    }

    public static void prettyPrintMatrix(double[][] matr) {
        for (double[] row : matr) {
            for (double col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
