import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array2DSumTest {

    @Test
    void sumRowsAndColumns() {

        int [][] matrixSum = {  {1,2,3},
                                {4,5,6},
                                {7,8,9}
        };
        int [][] resultSum = {{6, 15, 24}, {12,15,18}};

        assertArrayEquals(resultSum, Array2DSum.sumRowsAndColumns(matrixSum));
    }
}