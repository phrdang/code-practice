package Amogh;

import java.util.Scanner;

public class MatrixMult1 {
    public static void main(String[] args){

        System.out.println("Matrix A");
        double[][] a = getMatrix();

        System.out.println("Matrix B");
        double[][] b = getMatrix();

        //need columns of first matrix to be equal to rows of second matrix
        if (a[0].length == b.length){
            System.out.println("The product of the matrices is: ");
            double[][] productMatrix = multiplyMatrix(a, b);

            for (int i = 0; i < a.length; i++){
                for (int j = 0; j < b[0].length; j++){
                    System.out.print(productMatrix[i][j] + " "); //space between each element in row
                }
                System.out.println(); //new line for each row
            }
        } else {
            System.out.println("The matrices can not be multiplied. " +
                    "Make sure the columns of Matrix A are equal to " +
                    "the rows of Matrix B.");
        }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        int rowsA = a.length;

        int rowsB = b.length;
        int colsB = b[0].length;

        double[][] prodMatrix = new double [rowsA][colsB];

        for (int rowA = 0; rowA < rowsA; rowA++){ //we go through each row of the first matrix
            for (int colB = 0; colB < colsB; colB++){ //and each column of the second matrix
                double total = 0; //restarts value before it runs again

                for (int rowB = 0; rowB < rowsB; rowB++){ //multiplies each element. rowsB and colsA are the same.
                    double product = a[rowA][rowB] * b[rowB][colB];
                    total += product; //each product of elements adds to the previous total

                }
                prodMatrix[rowA][colB] = total;
            }
        }

        return prodMatrix;
    }

    public static double[][] getMatrix(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        double [][] matrix = new double [rows][cols];

        for (int i = 0; i < rows; i++){
            int row = i + 1;
            System.out.print("Enter row " + row + ": ");
            for (int j = 0; j < cols; j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }
}
