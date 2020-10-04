import java.util.Scanner;

public class MatrixMult {
    public static void main(String[] args){
        System.out.println("Matrix A");
        double[][] matrixA = makeMatrix();

        System.out.println("Matrix B");
        double[][] matrixB = makeMatrix();

        System.out.println("Matrix C is ");
        printMatrix(multiplyMatrices(matrixA, matrixB));
    }

    public static double[][] makeMatrix(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scan.nextInt();

        double[][] list = new double[rows][cols];

        for (int i = 0; i < rows; i++){
            System.out.print("Enter row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++){
                list[i][j] = scan.nextDouble();
            }
        }
        return list;
    }

    public static double[][] multiplyMatrices (double[][] array1, double[][] array2){
        int array1NumRows = array1.length;
        int array2NumCols = array2[0].length;
        int array1NumCols = array1[0].length;
        int array2NumRows = array1NumCols;

        double[][] multArray = new double[array1NumRows][array2NumCols];

        double num = 0;

        for (int i = 0; i < array1NumRows; i++){
            for (int j = 0; j < array2NumCols; j++){
                num = 0;
                for (int k = 0; k < array1NumCols; k++){
                    num += array1[i][k] * array2[k][j];
                }
                multArray[i][j] = num;
            }
        }
        return multArray;
    }
    public static void printMatrix(double[][] array){
        int rows = array.length;
        int cols = array[0].length;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
