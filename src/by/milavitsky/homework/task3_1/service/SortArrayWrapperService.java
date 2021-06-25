package by.milavitsky.homework.task3_1.service;

import by.milavitsky.homework.task3_1.entity.ArrayWrapper;

public class SortArrayWrapperService {
    public static void sortSelection(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        for (int i = 0; i < array.length; i++) {
            int minInd = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minInd]) {
                    minInd = j;
                }
            }
            swap(array, i, minInd);
        }
        arrayWrapper.setArray(array);
    }


    public static void sortBubbleDown(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        arrayWrapper.setArray(array);
    }

    public static int[] sortBubbleUp(int[] array) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        return array;
    }
    public static int[] sortBubbleDown(int[] array) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        return array;
    }

    public static void sortBubbleUp(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        arrayWrapper.setArray(array);
    }


    public static void sortShuttle(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (array[z] < array[z - 1]) {
                        swap(array, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }
        arrayWrapper.setArray(array);
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
