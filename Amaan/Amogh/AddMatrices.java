package Amogh;

import java.util.Scanner;

public class AddMatrices {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double matrix1[][] = new double[3][3];
        double matrix2[][] = new double[3][3];

        inputMatrix1(input, matrix1); //test on diff rows/columns
        inputMatrix2(input, matrix2);

        addMatrices(matrix1, matrix2);
    }

    public static void inputMatrix1(Scanner input, double[][] matrix) {
        System.out.print("Enter values for the first 3x3 matrix: ");

        for (int a = 0; a < 3; a++) {

            for (int b = 0; b < 3; b++) {

                matrix[a][b] = input.nextDouble();
            }
        }
    }

    public static void inputMatrix2(Scanner input, double[][] matrix) {
        System.out.print("Enter values for the second 3x3 matrix: ");

        for (int a = 0; a < 3; a++) {

            for (int b = 0; b < 3; b++) {

                matrix[a][b] = input.nextDouble();
            }
        }
    }

    public static void addMatrices(double[][] matrixA, double[][] matrixB){
        for (int a = 0; a < 3; a++) { //rows
            for (int b = 0; b < 3; b++) { //columns
                System.out.print(matrixA[a][b] + " ");
                if ((b == 2 && a == 0) || (b == 2 && a == 2)){
                    System.out.print("      ");
                }

                if (b == 2 && a == 1){
                    System.out.print("   +  ");
                }
            }
            for (int c = 0; c < 3; c++){ //columns for second matrix
                System.out.print(matrixB[a][c] + " ");

                if ((c == 2 && a == 0) || (c == 2 && a == 2)){
                    System.out.print("      ");
                }

                if (c == 2 && a == 1){
                    System.out.print("  =   ");
                }
            }

            System.out.print(matrixA[a][0] + matrixB[a][0] + " ");
            System.out.print(matrixA[a][1] + matrixB[a][1] + " ");
            System.out.print(matrixA[a][2] + matrixB[a][2]);

            System.out.println(); //new line after every row

        }

    }
}
