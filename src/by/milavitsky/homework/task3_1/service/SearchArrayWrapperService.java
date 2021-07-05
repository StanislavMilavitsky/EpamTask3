package by.milavitsky.homework.task3_1.service;

import by.milavitsky.homework.task3_1.entity.ArrayWrapper;

public class SearchArrayWrapperService {

    public static int binarySearch(ArrayWrapper arrayWrapper, int value) {
        int [] array = arrayWrapper.getArray();
        int firstElement = 0;
        int lastElement = 4;
        int elementToSearch = value;
        int index = methodBinartSearch(array,elementToSearch,firstElement, lastElement);
        return index;
    }

    private static int methodBinartSearch(int[] array, int elementToSearch, int firstElement, int lastElement) {
        if (firstElement <= lastElement) {
            int middle = (firstElement + lastElement) / 2;

            if (array[middle] > elementToSearch) {
                return methodBinartSearch(array, elementToSearch, firstElement, middle - 1);
            } else if (array[middle] < elementToSearch) {
                return methodBinartSearch(array, elementToSearch, middle + 1, lastElement);
            }
            return middle;
        }
        return -1;
    }

    public static int minElement(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maxElement(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static ArrayWrapper fibonacciNumbers(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        int[] arrayFibanacci = new int[array.length + 2];
        arrayFibanacci[0] = 0;
        arrayFibanacci[1] = 1;
        ArrayWrapper fibanacci = new ArrayWrapper();
        for (int i = 2; i < arrayFibanacci.length; i++) {
            arrayFibanacci[i] = array[i - 2];
        }
        for (int i = 2; i < arrayFibanacci.length; i++) {
            if (arrayFibanacci[i] == arrayFibanacci[i - 1] + arrayFibanacci[i - 2]) {
                fibanacci.add(arrayFibanacci[i]);
            }
        }

        return fibanacci;
    }

    public static int[] primeNumber(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        ArrayWrapper result = new ArrayWrapper();
        for (int element : array) {
            if (element > 0) {
                int count = 0;
                for (int i = 1; i <= element; i++) {
                    if ((element % i) == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    result.add(element);
                }
            }
        }
        return result.getArray();
    }

    public static int[] threeDigitNumbers(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        ArrayWrapper resultArray = new ArrayWrapper();
        for (int element : array) {
            if (element > 99 & element < 1000) {
                String value = String.valueOf(element);
                char ind0 = value.charAt(0);
                char ind1 = value.charAt(1);
                char ind2 = value.charAt(2);
                if (ind0 != ind1 && ind1 != ind2 && ind2 != ind0) {
                    resultArray.add(element);
                }
            }
        }
        return resultArray.getArray();
    }
}