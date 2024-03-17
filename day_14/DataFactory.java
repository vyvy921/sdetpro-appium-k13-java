package day_14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataFactory {

    public static void readFile(String absolutedFilePath){

        try {
            FileInputStream fileInputStream = new FileInputStream(absolutedFilePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
