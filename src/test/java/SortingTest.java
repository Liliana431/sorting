import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {

    @Test
    public void testConstructor() {
        int[] arr = new int[] {5, 2, 6, 7, 3, 1, 2, 9};
        Sorting s = new Sorting(arr);
        assertEquals(arr, s.getArray());
    }

    @Test
    public void testSortWithoutDuplicates() {
        Sorting s = new Sorting(new int[] {5, 2, 6, 7, 3, 1, 9});
        s.sorter();
        assertArrayEquals(new int[] {1, 2, 3, 5, 6, 7, 9}, s.getArray());
    }

    @Test
    public void testSortWithDuplicates() {
        Sorting s = new Sorting(new int[] {3, 1, 2, 1, 3, 1});
        s.sorter();
        assertArrayEquals(new int[] {1, 1, 1, 2, 3, 3}, s.getArray());
    }

    @Test
    public void testSortOneElem() {
        Sorting s = new Sorting(new int[] {3});
        s.sorter();
        assertArrayEquals(new int[] {3}, s.getArray());
    }
}
