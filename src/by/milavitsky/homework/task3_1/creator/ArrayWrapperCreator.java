package by.milavitsky.homework.task3_1.creator;

import by.milavitsky.homework.task3_1.entity.ArrayWrapper;
import by.milavitsky.homework.task3_1.view.Message;
import java.util.Scanner;

public class ArrayWrapperCreator {
    private static final int RANGE_OF_RANDOM = 2000;

    public static ArrayWrapper creatByConsole() {
        ArrayWrapper arrayWrapper = new ArrayWrapper();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int length;
        while((length = scanner.nextInt()) < 0){
            System.out.println("Enter positive length");
        }
        int[] array = new int[length];
        System.out.println("Enter values");
        for (int i = 0; i < length; i++) {
                array[i] = scanner.nextInt();;

        }
        arrayWrapper.setArray(array);
        return arrayWrapper;
    }

    public static ArrayWrapper creatRandomArray() {
        ArrayWrapper arrayWrapper = new ArrayWrapper();
        int length = (int)((Math.random()) * 10 + 1);
        int[] array = new int[length];
        double random = Math.random();
        double sign = 0;
        if (random >= 0.5){
            sign = -1;
        } else {
            sign = 1;
        }
        for (int i = 0; i < length; i++) {
            int values = (int) (Math.random() * RANGE_OF_RANDOM * sign);
            array[i] = values;
        }
        arrayWrapper.setArray(array);
        return arrayWrapper;
    }
}
