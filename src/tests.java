import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class tests {
    @Test
    void ones() {
        Integer[] unsorted = {8,4,7,2,7,1,8};
        Integer[] sorted = RadixSort.sort(unsorted,0);
        assertEquals(1, sorted[0]);
        assertEquals(2, sorted[1]);
        assertEquals(4, sorted[2]);
        assertEquals(7, sorted[3]);
        assertEquals(7, sorted[4]);
        assertEquals(8, sorted[5]);
    }

    @Test
    void tens() {
        Integer[] unsorted = {28,44,67,12,27,51,38};
        Integer[] sorted = RadixSort.sort(unsorted,0);
        assertEquals(51, sorted[0]);
        assertEquals(12, sorted[1]);
        assertEquals(44, sorted[2]);
        assertEquals(67, sorted[3]);
        assertEquals(27, sorted[4]);
        assertEquals(28, sorted[5]);
        sorted = RadixSort.sort(sorted,1);
        assertEquals(12, sorted[0]);
        assertEquals(27, sorted[1]);
        assertEquals(28, sorted[2]);
        assertEquals(38, sorted[3]);
        assertEquals(44, sorted[4]);
        assertEquals(51, sorted[5]);
    }

    @Test
    void hundreds() {
        Integer[] unsorted = {228,344,467,612,527,251,138};
        Integer[] sorted = RadixSort.sort(unsorted,0);
        assertEquals(251, sorted[0]);
        assertEquals(612, sorted[1]);
        assertEquals(344, sorted[2]);
        assertEquals(467, sorted[3]);
        assertEquals(527, sorted[4]);
        assertEquals(228, sorted[5]);
        sorted = RadixSort.sort(sorted,1);
        assertEquals(612, sorted[0]);
        assertEquals(527, sorted[1]);
        assertEquals(228, sorted[2]);
        assertEquals(138, sorted[3]);
        assertEquals(344, sorted[4]);
        assertEquals(251, sorted[5]);
        sorted = RadixSort.sort(sorted,2);
        assertEquals(138, sorted[0]);
        assertEquals(228, sorted[1]);
        assertEquals(251, sorted[2]);
        assertEquals(344, sorted[3]);
        assertEquals(467, sorted[4]);
        assertEquals(527, sorted[5]);
    }
}
