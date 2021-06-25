package by.milavitsky.homework.task3_2.service;

import java.util.Comparator;

import static by.milavitsky.homework.task3_2.utils.Utils.calculateMinElement;

public class ArraysByMin implements Comparator<int[]>{
    @Override
    public int compare(int[] arrayA, int[] arrayB) {
        int minA = calculateMinElement(arrayA);
        int minB = calculateMinElement(arrayB);
        return minA - minB;
    }
}
