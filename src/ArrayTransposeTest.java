import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTransposeTest {

    @Test
    void transpose() {
        ArrayTranspose arrayTranspose = new ArrayTranspose();

        int [][] matrix = {{1,2,3}, {4,5,6},{7,8,9}};
        int [][] result = {{1,4,7}, {2,5,8}, {3,6,9}};

        assertArrayEquals(result, ArrayTranspose.transpose(matrix));
        assertArrayEquals(result,ArrayTranspose.transpose(matrix), "IllegalArgumentException");

    }


}