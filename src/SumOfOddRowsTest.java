import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfOddRowsTest {

    @Test
    void sumOddRows() {

        SumOfOddRows sumOfOddRows = new SumOfOddRows();

        int [][] matrix = { {1,2},
                            {3,4},
                            {5,6}
                          };

        assertEquals(7, SumOfOddRows.sumOddRows(matrix));

    }

    @Test
    void sumOddRows2() {
        int [][] matrix2 = {{4,5,2},
                            {1,6,3},
                            {7,3,8},
                            {9,0,1},
                            {3,8,7}};
        assertEquals(20, SumOfOddRows.sumOddRows(matrix2));
    }
}