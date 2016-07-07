package com.java.courses.exceptions.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {

    public static void main(String[] args) {
        CheckedExceptions checkedExceptions = new CheckedExceptions();
        checkedExceptions.readFile();
    }

    public void readFile() {
        File file = new File("d:\\1.txt");
        FileReader reader = null;
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void readFileWithResources() {
        File file = new File("d:\\1.txt");

        try (FileReader reader = new FileReader(file)) {
            //reading file
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
