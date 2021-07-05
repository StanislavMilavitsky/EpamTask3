package by.milavitsky.homework.task3_1.runner;
import by.milavitsky.homework.task3_1.entity.ArrayWrapper;

import static by.milavitsky.homework.task3_1.view.Message.*;
import static by.milavitsky.homework.task3_1.parser.StringToArrayParser.*;

import static  by.milavitsky.homework.task3_1.reader.FileArrayReader.*;
public class RunnerFile {
    public static void runFileArray(){
        String arrayFile = readFile();
        ArrayWrapper arrayWrapper = parseToArrayWrapper(arrayFile);
        showMessage(arrayWrapper.arrayToString());
    }
}
