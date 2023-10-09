import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixOfShorterStringsTest {

    @Test
    void matrix() {
        String[][] matrix = {{"apple", "banana", "orange"},
                             {"cat", "dog", "elephant"},
                            {"red", "green", "blue"}};

        String [][] matrix2 = {{"app", "pear", "grape"},
                               {"rabbit", "fox", "lion"},
                               {"purple", "pink", "yellow"}};

        String [][] resultMatrix = {{"app", "pear", "grape"},
                                    {"cat", "dog", "lion"},
                                    {"red", "pink", "blue"}};


        assertArrayEquals(resultMatrix, MatrixOfShorterStrings.matrix(matrix,matrix2));
    }
}