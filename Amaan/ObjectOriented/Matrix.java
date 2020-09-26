
import java.util.Scanner;

public class Matrix {
    public double[][] matrix;

    public Matrix(double[][] in) {
        this.matrix = in;
    }

    public Matrix(int rows, int columns) {
        this.matrix = new double[rows][columns];
    }

    public Matrix() {
        matrix = new double[3][3];
    }

    public double[] getColumn(int col) {
        double[] res = new double[getNumRows()];

        for (int i = 0; i < getNumRows(); i++) {
//            res[i] = matrix[i][col];
            res[i] = getItem(i, col);
        }
        return res;
    }

    public Matrix multiply(Matrix B) {
        Matrix res = new Matrix(this.getNumRows(), B.getNumColumns());

        for (int row = 0; row < this.getNumRows(); row++) {
            for (int col = 0; col < B.getNumColumns(); col++) {
                res.matrix[row][col] = dotProduct(this.getRow(row), B.getColumn(col));
            }
        }
        return res;
    }

    public static double dotProduct(double[] a, double[] b) {
        double prod = 0;
        for (int i = 0; i < a.length; i++) {
            prod += a[i] * b[i];
        }

        return prod;
    }

    public Matrix add(Matrix B) {
        // check if they don't have same # of rows and columns
        if (this.getNumRows() != B.getNumRows() || this.getNumColumns() != B.getNumColumns()) {
            return new Matrix();
        }

        Matrix res = new Matrix(this.getNumRows(), this.getNumColumns());

        for (int i = 0; i < this.getNumRows(); i++) {
            for (int j = 0; j < this.getNumColumns(); j++) {
                res.matrix[i][j] = this.getItem(i, j) + B.getItem(i, j);
            }
        }

        return res;
    }

    public static Matrix getMatrix() {
        Scanner inp = new Scanner(System.in);

        int rows, cols;

        System.out.print("Enter number of rows: ");
        rows = inp.nextInt();
        System.out.print("Enter number of columns: ");
        cols = inp.nextInt();

        Matrix res = new Matrix(rows, cols);

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                res.matrix[i][j] = inp.nextDouble();
            }
        }
        return res;
    }

    public double[] getRow(int rowNumber) {
        return this.matrix[rowNumber];
    }

    public double getItem(int row, int col) {
        return this.matrix[row][col];
    }

    public int getNumRows() {
        return this.matrix.length;
    }

    public int getNumColumns() {
        return getRow(0).length;
    }

    public void setNumRows(int rows) {
        this.matrix = new double[rows][getNumColumns()];
    }

    public void setNumColumns(int cols) {
        this.matrix = new double[getNumRows()][cols];
    }

    public double[][] toDoubleArray() {
        return this.matrix;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

        for (double[] row : this.matrix) {
            for (double col : row) {
                res.append(col).append(" ");
            }
            res.append("\n");
        }

        return res.toString();
    }
}
