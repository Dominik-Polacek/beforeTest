import java.lang.reflect.Array;

public class MaximumValueInEachRowMatrix {

    //hledej maximální hodnotu v každým řádku
    public static int[] maxRows(int[][] matrix) {
        int[] arr = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int max = Integer.MIN_VALUE; //min protože hledáme největší :-)
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            arr[i] = max;
        }
        return arr;
    }
}
