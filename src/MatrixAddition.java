import java.util.Arrays;

public class MatrixAddition {

//    Write a matrixAddition function which takes two matrices as parameters
//    and returns a new matrix which is the sum of the two matrices.
//    The method should only add matrices with the same number of rows and columns
//    and throw an exception with"Invalid input" message on invalid input.

    public static void main(String[] args) {

        int[][] firstMat = {{1, 2, 3, 4}};
        int[][] secondMat = {{5, 6, 7, 8}};

        int[][] sum = matrix(firstMat, secondMat); //ukládáme matice do sum
        //iteruj mi matrix (matice) a vytiskni mi ho ve Stringu
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
            }
            System.out.println(Arrays.toString(sum[i]));
            System.out.println(); // Move to the next line for the next row
        }
    }

    public static int[][] matrix(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length || firstMatrix[0].length != secondMatrix[0].length) {
            throw new IllegalArgumentException("Invalid input: Matrices must have the same number of rows and columns.");
        }
        //uložím si matice do proměnných rows / cols - zde hlavně kvůli lepší čitelnosti
        int rows = firstMatrix.length;
        int cols = firstMatrix[0].length;

        int[][] sum = new int[rows][cols];
        //procházej smyčkami a přičitej indexi řádků a sloupců do sum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return sum;
    }
}
