public class MaximumValueInEachCols {
    public static int[] maxRows(int[][] matrix) {
        int[] arr = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
            arr[i] = max;
        }
        return arr;
    }

}
