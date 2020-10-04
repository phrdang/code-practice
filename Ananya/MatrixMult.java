package Ananya;
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

    public static void main(String[] args){

        double [][] A = makeMatrix();
        double [][] B = makeMatrix();

        if(A.length == B.length && A[0].length == B[0].length){
            System.out.println("The sum of the two matrices is: ");
            printMatrix(addMatrices(A, B));
        }
        else
            System.out.println("The matrices have different dimensions. They cannot be added.");

        if (A[0].length == B.length){
            System.out.println("The product of the two matrices is: ");
            printMatrix(multiplyMatrices(A, B));
        }
        else
            System.out.println("The matrices do not have the correct dimensions to be multiplied.");
    }

    public static double[][] makeMatrix(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of rows: ");
        int rows = scan.nextInt();
        System.out.println("Number of columns: ");
        int columns = scan.nextInt();

        double [][] matrix = new double[rows][columns];

        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.println("Enter matrix value: ");
                matrix[i][j] = scan.nextDouble();
            }
        }

        return matrix;
    }

    public static double[][] addMatrices(double [][] a, double [][] b){
        double[][] ans = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                ans[i][j] = a[i][j] + b[i][j];
            }
        }
        return ans;
    }

    public static void printMatrix(double [][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                if(i == 0){
                    System.out.println(a[i][j] + " ");
                }
                else
                    System.out.print(a[i][j] + " ");
            }
        }
    }

    public static double[][] multiplyMatrices(double [][] a, double [][] b){
        double[][] ans = new double[a.length][b[0].length];
        for(int l = 0; l < a.length; l++){
            for(int i = 0; i < a.length; i ++){
                double count = 0;
                for(int j = 0; j < b[0].length; j++){
                    count += a[i][j] * b[j][i];
                }
                ans[l][i] = count;
            }

        }
        return ans;
    }
}