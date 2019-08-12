package cl.ejeldes.io.file.java;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Created by ejeldes on Aug 11, 2019
 */
public class FileReading {

    public static void main(String[] args) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(
                    new FileInputStream(new File("testfile.txt")), StandardCharsets.UTF_8);
            int character;
            while ((character = inputStreamReader.read()) != -1) {
                char word = (char) character;
                System.out.print(word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
