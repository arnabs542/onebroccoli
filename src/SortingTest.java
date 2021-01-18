import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortingTest {
    @Test
    void testInsertionSort () {
        int[] arr = {8,5,4,7,6,9,1,3,2,0};
        Sorting.insertionSort(arr);
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        assertArrayEquals(expected,arr);
    }

}