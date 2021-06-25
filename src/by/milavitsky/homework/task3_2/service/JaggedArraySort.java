package by.milavitsky.homework.task3_2.service;

import by.milavitsky.homework.task3_2.enums.EnumSort;

import java.util.Comparator;
import java.util.HashMap;

public class JaggedArraySort {

    private static final HashMap<EnumSort, Comparator<int []>> map = new HashMap<>();
    static {
        map.put(EnumSort.BY_SUM, new ArraysBySum());
        map.put(EnumSort.BY_SUM_REVERSE, new ArraysBySumReverce());
        map.put(EnumSort.BY_MAX, new ArraysByMax());
        map.put(EnumSort.BY_MAX_REVERSE, new ArraysByMaxReverse());
        map.put(EnumSort.BY_MIN, new ArraysByMin());
        map.put(EnumSort.BY_MIN_REVERSE, new ArraysByMinReverce());

    }
    public static int[][] sortBubble(int[][] array, EnumSort enumSort) {

        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (map.get(enumSort).compare(array[j + 1], array[j]) > 0) {
                    int[] ints = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = ints;
                }
            }
        }
        return array;
    }



}
