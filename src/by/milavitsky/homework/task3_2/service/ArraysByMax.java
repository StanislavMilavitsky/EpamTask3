package by.milavitsky.homework.task3_2.service;

import java.util.Comparator;

import static by.milavitsky.homework.task3_2.utils.Utils.calculateMaxElement;

public class ArraysByMax implements Comparator<int[]> {
    @Override
    public int compare(int[] arrayA, int[] arrayB) {
        int maxA = calculateMaxElement(arrayA);
        int maxB = calculateMaxElement(arrayB);
        return maxA - maxB;
    }
}

