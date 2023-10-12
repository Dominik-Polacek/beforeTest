public class Array2DSum {
//    Write a method that takes a 2D array of integers and returns a new 2D array
//    where the first row consists of the sum of each row of the input array,
//    and the second row consists of the sum of each column of the input array.


    //sečti mi všechny řádky, následně všechny sloupce v matici
    public static int[][] sumRowsAndColumns(int[][] matrix) {
        //Zjistíme počet řádků a sloupců vstupní matice.
        int rows = matrix.length;
        int cols = matrix[0].length;
        //Vytvoříme novou matici sum s dvěma řádky a počtem sloupců
        // rovným většímu z počtu řádků a počtu sloupců vstupní matice.
        // Tím zajistíme, že máme dostatek prostoru pro ukládání součtů řádků a sloupců.
        int[][] sum = new int[2][Math.max(rows, cols)];

        //spočítá součet každého řádku vstupní matice a uloží ho do prvního řádku matice sum
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            sum[0][i] = rowSum;
        }

        //spočítá součet každého sloupce vstupní matice a uloží ho do druhého řádku matice sum
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            sum[1][j] = colSum;
        }
        return sum;
    }


}
