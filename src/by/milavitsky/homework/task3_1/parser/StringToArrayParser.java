package by.milavitsky.homework.task3_1.parser;

import by.milavitsky.homework.task3_1.entity.ArrayWrapper;

public class StringToArrayParser {
    public static ArrayWrapper parseToArrayWrapper(String stringFile){
        ArrayWrapper arrayWrapper = new ArrayWrapper();
        String [] split = stringFile.split("\\W+");
        for (String element : split){
            int value = Integer.parseInt(element);
            arrayWrapper.add(value);
        }
        return  arrayWrapper;
    }
}
