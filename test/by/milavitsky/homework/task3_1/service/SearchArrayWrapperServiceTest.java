package by.milavitsky.homework.task3_1.service;

import by.milavitsky.homework.task3_1.entity.ArrayWrapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchArrayWrapperServiceTest {
    ArrayWrapper arrayWrapper;

    @Before
    public void setUp() throws Exception {
        arrayWrapper = new ArrayWrapper();
        arrayWrapper.setArray(1, 2, 3, 4, 5);
    }

    @After
    public void tearDown() throws Exception {
        arrayWrapper = null;
    }

    @Test
    public void testBinarySearchPositive(){
        int actual = SearchArrayWrapperService.binarySearch(arrayWrapper, 5);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void testBinarySearchNegative(){
        int actual = SearchArrayWrapperService.binarySearch(arrayWrapper, 5);
        int expected = 2;
        assertNotEquals(expected, actual);
    }

    @Test
    public void testMinElementPositive() {
        int actual = SearchArrayWrapperService.minElement(arrayWrapper);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testMinElementNegative() {
        int actual = SearchArrayWrapperService.minElement(arrayWrapper);
        int expected = 2;
        assertNotEquals(expected, actual);
    }

    @Test
    public void testMaxElementPositive() {
        int actual = SearchArrayWrapperService.maxElement(arrayWrapper);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxElementNegative() {
        int actual = SearchArrayWrapperService.maxElement(arrayWrapper);
        int expected = 4;
        assertNotEquals(expected, actual);
    }

    @Test
    public void fibonacciNumbers() {
        arrayWrapper.setArray(5, 6, 11, 5, 16);
        arrayWrapper = SearchArrayWrapperService.fibonacciNumbers(arrayWrapper);
        int [] actual = arrayWrapper.getArray();
        int[] expected = {6, 11, 16};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void primeElement() {
        arrayWrapper.setArray(4, 5, 6, 7);
        int [] actual = SearchArrayWrapperService.primeNumber(arrayWrapper);
        int [] expected = {5, 7};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void threeDigitNumbers() {
        arrayWrapper.setArray(111, 123, 256, 234);
        int [] actual = SearchArrayWrapperService.threeDigitNumbers(arrayWrapper);
        int [] expected = {123, 256, 234};
        assertArrayEquals(expected, actual);
    }
}