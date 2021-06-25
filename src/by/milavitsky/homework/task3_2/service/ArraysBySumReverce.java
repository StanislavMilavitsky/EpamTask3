package by.milavitsky.homework.task3_2.service;

import java.util.Comparator;

public class ArraysBySumReverce implements Comparator<int[]> {
    @Override
    public int compare(int[] arrayA, int[] arrayB) {
        return new ArraysBySum().reversed().compare(arrayA, arrayB);
    }
}
