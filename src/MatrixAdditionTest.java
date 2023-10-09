import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixAdditionTest {

    @Test
    void matrix() {
        MatrixAddition matrixAddition = new MatrixAddition();

        int [][] firstMatrix = {{1, 2, 3, 4}};
        int [][] secondMatrix = {{5, 6, 7, 8}};
        int [][] sum = {{6, 8, 10, 12}};

        //int [][] actual = MatrixAddition.matrix(firstMatrix,secondMatrix);

        assertArrayEquals(sum,MatrixAddition.matrix(firstMatrix,secondMatrix));

    }
}