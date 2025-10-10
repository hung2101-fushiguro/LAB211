/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author DELL
 */
public class Matrix {

    int row;
    int col;
    double[][] data;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.data = new double[row][col];
    }

    public void displayMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Matrix additionMatrix(Matrix matrix2) {
        if (this.row != matrix2.row || this.col != matrix2.col) {
            return null;
        }
        Matrix result = new Matrix(row, col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result.data[i][j] = this.data[i][j] + matrix2.data[i][j];
            }
        }
        return result;
    }

    public Matrix subtractionMatrix(Matrix matrix2) {
        if (this.row != matrix2.row || this.col != matrix2.col) {
            return null;
        }
        Matrix result = new Matrix(row, col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result.data[i][j] = this.data[i][j] - matrix2.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiplicationMatrix(Matrix matrix2) {
        if (this.col != matrix2.row) {
            return null;
        }
        Matrix result = new Matrix(this.row, matrix2.col);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < matrix2.col; j++) {
                for (int k = 0; k < this.col; k++) {
                    result.data[i][j] += this.data[i][k] * matrix2.data[k][j];
                }
            }
        }
        return result;
    }

}
