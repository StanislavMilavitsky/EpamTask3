package by.milavitsky.homework.task3_2.service;

import by.milavitsky.homework.task3_2.enums.EnumSort;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class JaggedArraySortTest {
    int [][] multiArray;
    @Before
    public void setUp() throws Exception {
         multiArray = new int[][]{{2}, {1, 6, 7}, {66, 34, 5, 3}, {1235, 23, 123, 6234, 34}};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSortBubbleBySum() {
        int[][] actual = JaggedArraySort.sortBubble(multiArray, EnumSort.BY_SUM);
        int [][] expected ={{1235, 23, 123, 6234, 34}, {66, 34, 5, 3}, {1, 6, 7}, {2}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortBubbleBySumReverse() {
        int[][] actual = JaggedArraySort.sortBubble(multiArray, EnumSort.BY_SUM_REVERSE);
        int [][] expected ={{2}, {1, 6, 7}, {66, 34, 5, 3}, {1235, 23, 123, 6234, 34}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortBubbleByMax() {
        int[][] actual = JaggedArraySort.sortBubble(multiArray, EnumSort.BY_MAX);
        int [][] expected ={{1235, 23, 123, 6234, 34}, {66, 34, 5, 3}, {1, 6, 7}, {2}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortBubbleByMaxReverse() {
        int[][] actual = JaggedArraySort.sortBubble(multiArray, EnumSort.BY_MAX_REVERSE);
        int [][] expected ={{2}, {1, 6, 7}, {66, 34, 5, 3}, {1235, 23, 123, 6234, 34}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortBubbleByMin() {
        int[][] actual = JaggedArraySort.sortBubble(multiArray, EnumSort.BY_MIN);
        int [][] expected ={{1235, 23, 123, 6234, 34}, {66, 34, 5, 3}, {2}, {1, 6, 7}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortBubbleByMinReverse() {
        int[][] actual = JaggedArraySort.sortBubble(multiArray, EnumSort.BY_MIN_REVERSE);
        int [][] expected ={{1, 6, 7}, {2}, {66, 34, 5, 3}, {1235, 23, 123, 6234, 34}};
        assertArrayEquals(expected, actual);
    }
}