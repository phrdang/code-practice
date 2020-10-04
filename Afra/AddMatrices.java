import java.util.Scanner;
import java.util.Arrays;

public class AddMatrices {
    /*
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
    public static void main(String[] args){
        System.out.print("Enter 9 numbers to make a 3x3 matrix1: ");
        double[][] array1 = makeArray();

        System.out.print("Enter 9 numbers to make a 3x3 matrix2: ");
        double[][] array2 = makeArray();

        double[][] sumArray = addMatrix(array1, array2);
        printMatrices(array1, array2, sumArray);

    }
    public static double[][] makeArray(){
        Scanner scan = new Scanner(System.in);

        double[][] array = new double[3][3];

        for(int rows = 0; rows < 3; rows++){
            for(int cols = 0; cols < 3; cols++){
                array[rows][cols] = scan.nextDouble();
            }
        }

        return array;
    }

    public static double[][] addMatrix (double[][] array1, double[][] array2){

        double[][] array = new double[3][3];

        for(int rows = 0; rows < 3; rows++){
            for(int cols = 0; cols < 3; cols++){
                array[rows][cols] = array1[rows][cols] + array2[rows][cols] ;
            }
        }

        return array;
    }
    public static void printMatrices (double[][] array1, double[][] array2, double[][] sumArray){
        System.out.print(array1[0][0] + " " + array1[0][1] + " " + array1[0][2] + "     ");
        System.out.print(array2[0][0] + " " + array2[0][1] + " " + array2[0][2] + "     ");
        System.out.println(sumArray[0][0] + " " + sumArray[0][1] + " " + sumArray[0][2] );

        System.out.print(array1[1][0] + " " + array1[1][1] + " " + array1[1][2] + "  +  ");
        System.out.print(array2[1][0] + " " + array2[1][1] + " " + array2[1][2] + "  =  ");
        System.out.println(sumArray[1][0] + " " + sumArray[1][1] + " " + sumArray[1][2] );

        System.out.print(array1[2][0] + " " + array1[2][1] + " " + array1[2][2] + "     ");
        System.out.print(array2[2][0] + " " + array2[2][1] + " " + array2[2][2] + "     ");
        System.out.println(sumArray[2][0] + " " + sumArray[2][1] + " " + sumArray[2][2] );
    }
}
