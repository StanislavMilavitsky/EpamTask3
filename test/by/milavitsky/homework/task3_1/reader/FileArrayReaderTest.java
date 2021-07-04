package by.milavitsky.homework.task3_1.reader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileArrayReaderTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testReadFilePositive() {
        String actual = FileArrayReader.readFile();
        String expected = "5, 4, 9, 123, 113, 27";
        assertEquals(actual, expected);
    }

    @Test
    public void testReadFileNegative() {
        String actual = FileArrayReader.readFile();
        String expected = "5, 4, 9, 123, 113, 26";
        assertNotEquals(actual, expected);
    }
}