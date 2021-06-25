package by.milavitsky.homework.task3_2.validation;

import java.util.ArrayList;

public class Validator {
    public static boolean isInteger(double value) {
        return value % 1 == 0;
    }


    public static boolean isNull(double value) {
        return value == 0;
    }

    public static boolean isValueEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isValuePositive(int value) {
        return value > 0;
    }

    public static boolean isArrayRectangular(ArrayList<Integer> list){
        boolean isRectangular = false;
        int size = list.size();
        int element = list.get(0);
        int sum = 0;
        for(int i = 1; i < size; i++){
             sum = sum + list.get(i);
        }
        if( element == sum / size){
            isRectangular = true;
        }
        return isRectangular;
    }
}
