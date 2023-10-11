import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumValueInEachColsTest {

    @Test
    void maxRows() {
        int [][] input = {{1,5,3}, {2,3,4}, {3,2,4}};
        int [] output = {3,5,4};

        assertArrayEquals(output, MaximumValueInEachCols.maxRows(input));
    }
}