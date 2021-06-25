package by.milavitsky.homework.task3_2.main;

import by.milavitsky.homework.task3_2.enums.EnumSort;
import by.milavitsky.homework.task3_2.service.JaggedArraySort;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] multiArray = {{1}, {1, 6, 7}, {66, 34, 5, 3}, {1235, 23, 123, 6234, 34}};
       int [][] multiArraySorted = JaggedArraySort.sortBubble(multiArray, EnumSort.BY_MAX);
        for(int i = 0; i < multiArraySorted.length; i ++){
            System.out.println(Arrays.toString(multiArraySorted[i]));

        }


    }
}
