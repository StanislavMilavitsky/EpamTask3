package by.milavitsky.homework.task3_2.service;

import java.util.Comparator;

import static by.milavitsky.homework.task3_2.utils.Utils.calculateMinElement;

public class ArraysByMinReverce implements Comparator<int[]> {
    @Override
    public int compare(int[] arrayA, int[] arrayB) {
        return new ArraysByMin().reversed().compare(arrayA, arrayB);
    }
}
