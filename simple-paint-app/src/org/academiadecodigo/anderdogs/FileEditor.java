package org.academiadecodigo.anderdogs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileEditor {

    public static final String FILE_PATH = "resources/paint.txt";

    public void saveToFile(String string) {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH));
            bufferedWriter.write(string);
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
