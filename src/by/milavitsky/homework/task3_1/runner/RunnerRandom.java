package by.milavitsky.homework.task3_1.runner;

import by.milavitsky.homework.task3_1.entity.ArrayWrapper;
import by.milavitsky.homework.task3_1.creator.ArrayWrapperCreator;
import by.milavitsky.homework.task3_1.view.Message;


public class RunnerRandom {
    public static void runRandomArray(){
        ArrayWrapper arrayWrapper = ArrayWrapperCreator.creatRandomArray();
        Message.showMessage(arrayWrapper.arrayToString());
    }
}
