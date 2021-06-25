package by.milavitsky.homework.task3_1.entity;

import java.io.Serializable;
import java.util.Arrays;

public class ArrayWrapper implements Serializable {
    private int arrayLength;
    private int[] array;

    public ArrayWrapper() {
        array = new int[1];
    }

    public ArrayWrapper(int arrayLength) {
        array = new int[arrayLength];
        this.arrayLength = arrayLength;
    }


    public ArrayWrapper(int... x) {
        arrayLength = x.length;
        array = Arrays.copyOf(x, arrayLength);
    }

    public ArrayWrapper(ArrayWrapper arrayWrapper) {
        array = arrayWrapper.getArray();
    }

    public int getArrayLength() {
        return arrayLength;
    }


    public int[] getArray() {
        return Arrays.copyOf(array, arrayLength);//todo
    }

    public void setArray(int... x) {
        arrayLength = x.length;
        array = Arrays.copyOf(x, arrayLength);
    }

    public void setArray(ArrayWrapper arrayWrapper) {
        array = arrayWrapper.getArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ArrayWrapper arrayWrapper = (ArrayWrapper) obj;
        if (this.arrayLength != arrayWrapper.arrayLength) {
            return false;
        }
        for (int i = 0; i < this.arrayLength; i++) {
            if (this.array[i] != arrayWrapper.array[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 27 * arrayLength + ((array.length == 0) ? 0 : array.hashCode());
    }

    public String toString() {
        return getClass().getName() + " @ " + "length = " + arrayLength + " , array = " + arrayToString();
    }

    public void installElement(int index, int value) {
        array[index] = value;
    }

    public void add(int element) {
        int[] array = this.getArray();
        int sizeArray = array.length + 1;
        int[] arrayWithElement = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            arrayWithElement[i] = array[i];
        }
        arrayWithElement[sizeArray - 1] = element;
        this.setArray(arrayWithElement);

    }

    public int[] reciveIndex(int value) {
        int[] array = this.array;
        int count = 0;
        ArrayWrapper result = new ArrayWrapper();
        for (int element : array) {
            if (element == value) {
                result.add(count);
            }
            count++;
        }
        return result.getArray();
    }

    public int reciveElement(int index) {
        int[] array = this.array;
        return array[index];
    }

    public void removeElement(int index) {
        int[] array = this.getArray();
        int[] result = new int[array.length - 1];
        System.arraycopy(array, 0, result, 0, index);
        System.arraycopy(array, index + 1, result, index, array.length - index - 1);
        this.array = result;

    }

    public String arrayToString() {
        String stringArray = Arrays.toString(array);
        stringArray = stringArray.substring(1, stringArray.length() - 1);
        return stringArray;
    }


}
