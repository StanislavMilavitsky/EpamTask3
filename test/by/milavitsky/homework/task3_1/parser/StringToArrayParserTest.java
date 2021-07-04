package by.milavitsky.homework.task3_1.parser;

import by.milavitsky.homework.task3_1.entity.ArrayWrapper;
import by.milavitsky.homework.task3_1.reader.FileArrayReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StringToArrayParserTest {
    ArrayWrapper arrayWrapper;
    @Before
    public void setUp() throws Exception {
        arrayWrapper = new ArrayWrapper();
        arrayWrapper= StringToArrayParser.parseToArrayWrapper(FileArrayReader.readFile());
    }

    @After
    public void tearDown() throws Exception {
        arrayWrapper = null;
    }

    @Test
    public void testParseToArrayWrapperPositive() {
        int[] actual = arrayWrapper.getArray();
        int [] expected = {5, 4, 9 ,123 , 113, 27};
        assertArrayEquals(expected, actual);
    }
}