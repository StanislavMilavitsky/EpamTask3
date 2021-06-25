package by.milavitsky.homework.task3_1.validation;

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
}
