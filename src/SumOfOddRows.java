public class SumOfOddRows {
//Write a sumOddRows method that takes a 2D array / matrix containing integers
// and returns the sum of all elements in odd rows (0-indexed).
// If the given 2D array / matrix is null, the function should throw an IllegalArgumentException.

    public static int sumOddRows(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Input matrix is null!");
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 1) {    //zkontroluj, jestli je matice lichá, s 0 == sudá
                for (int j = 0; j < cols; j++) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
