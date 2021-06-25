package by.milavitsky.homework.task3_1.reader;

import by.milavitsky.homework.task3_1.view.Message;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileArrayReader {
    private static final String PATH = "src\\resources\\file_array.txt";

    public static String readFile() {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                builder.append(line);
            }
        } catch (IOException ex) {
            Message.showMessage(ex.getMessage());
        }

        return builder.toString();
    }
}
