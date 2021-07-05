package by.milavitsky.homework.task3_1.service;

import by.milavitsky.homework.task3_1.entity.ArrayWrapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortArrayWrapperServiceTest {
    ArrayWrapper arrayWrapper;

    @Before
    public void setUp() throws Exception {
        arrayWrapper = new ArrayWrapper();
        arrayWrapper.setArray(1, 3 , 2, 5, 4);
    }

    @After
    public void tearDown() throws Exception {
        arrayWrapper = null;
    }

    @Test
    public void testSortSelection() {
        arrayWrapper = SortArrayWrapperService.sortSelection(arrayWrapper);
        int [] actual = arrayWrapper.getArray();
        int [] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortBubbleDown() {
        arrayWrapper = SortArrayWrapperService.sortBubbleDown(arrayWrapper);
        int [] actual = arrayWrapper.getArray();
        int [] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortBubbleUp() {
        arrayWrapper = SortArrayWrapperService.sortBubbleUp(arrayWrapper);
        int [] actual = arrayWrapper.getArray();
        int [] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortShuttle() {
        arrayWrapper = SortArrayWrapperService.sortShuttle(arrayWrapper);
        int [] actual = arrayWrapper.getArray();
        int [] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, actual);
    }
}