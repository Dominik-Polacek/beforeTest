import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumValueInEachRowMatrixTest {

    @Test
    void maxRows() {
        int [][] matrix = {{1,5,9,7,-5},
                            {5,2,10,-6,5},
                            {-3,-10,-2,-5,-3}};

        int [] matrixOutput = {9,10,-2};

        assertArrayEquals(matrixOutput, MaximumValueInEachRowMatrix.maxRows(matrix));
    }

    @Test
    void maxRows2() {
        int [][] matrix = {{1,5}, {3,5}, {0,0}, {7,9}};
        int [] output = {5,5,0,9};

        assertArrayEquals(output,MaximumValueInEachRowMatrix.maxRows(matrix));
    }
}