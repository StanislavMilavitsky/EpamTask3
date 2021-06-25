package by.milavitsky.homework.task3_2.service;

import java.util.Comparator;

import static by.milavitsky.homework.task3_2.utils.Utils.calculateMaxElement;

public class ArraysByMaxReverse implements Comparator<int[]> {
    @Override
    public int compare(int[] arrayA, int[] arrayB) {
        return new ArraysByMax().reversed().compare(arrayA, arrayB);
    }
}

