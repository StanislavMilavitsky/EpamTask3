package by.milavitsky.homework.task3_1.runner;

import by.milavitsky.homework.task3_1.entity.ArrayWrapper;
import by.milavitsky.homework.task3_1.creator.ArrayWrapperCreator;
import by.milavitsky.homework.task3_1.exception.IncorrectValueException;
import by.milavitsky.homework.task3_1.service.SearchArrayWrapperService;

public class RunnerConsole {
    public static void runConsoleArray(){
        ArrayWrapper arrayWrapper = ArrayWrapperCreator.creatByConsole();
            int x = SearchArrayWrapperService.binarySearch(arrayWrapper, 5);

    }
}
