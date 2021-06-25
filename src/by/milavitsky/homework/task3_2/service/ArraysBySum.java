package by.milavitsky.homework.task3_2.service;

import static by.milavitsky.homework.task3_2.utils.Utils.*;
import java.util.Comparator;

public class ArraysBySum implements Comparator<int[]> {
    @Override
    public int compare(int[] arrayA, int[] arrayB) {
        int sumA = calculateArraySum(arrayA);
        int sumB = calculateArraySum(arrayB);
        return sumA - sumB;
    }
}
