public class ArrayTranspose {
    //Write a method called transpose(int[][] matrix) which takes a 2D integer array as input
    // and returns its transpose. The transpose of a matrix is a new matrix
    // in which the rows and columns are swapped. That is, the first row of the original matrix
    // becomes the first column of the new matrix, the second row becomes the second column, and so on.
    //input in TEST

    //otoč mi matici
    public static int [][] transpose(int [][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
