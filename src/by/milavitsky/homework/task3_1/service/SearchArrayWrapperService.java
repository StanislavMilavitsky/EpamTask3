package by.milavitsky.homework.task3_1.service;
import static by.milavitsky.homework.task3_1.view.Message.*;
import static by.milavitsky.homework.task3_1.validation.Validator.*;
import by.milavitsky.homework.task3_1.entity.ArrayWrapper;

import static by.milavitsky.homework.task3_1.service.SortArrayWrapperService.sortBubbleUp;

public class SearchArrayWrapperService {

    public static int binarySearch(ArrayWrapper arrayWrapper, int value) {
        if(!isInteger(value)){
            showMessage("Not integer in binary search");
        }
        int[] array = arrayWrapper.getArray();
        array = sortBubbleUp(array);
        arrayWrapper.setArray(array);
        int firstElement = 0;
        int lastElement = array.length - 1;
        int element = methodOfBinSearch(array, firstElement, lastElement, value);
        return element;

    }

    private static int methodOfBinSearch(int[] array, int firstElement, int lastElement, int elementToSearch) {
        if (lastElement >= firstElement) {
            int middleIndex = (lastElement + firstElement) / 2;
            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            }
            if (array[middleIndex] > elementToSearch) {
                return methodOfBinSearch(array, firstElement, middleIndex - 1, elementToSearch);
            }
            return methodOfBinSearch(array, firstElement, middleIndex + 1, elementToSearch);
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

    public static int[] primeElement(ArrayWrapper arrayWrapper) {
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