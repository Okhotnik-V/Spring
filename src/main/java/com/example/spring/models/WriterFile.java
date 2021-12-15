package com.example.spring.models;

import com.example.spring.ui.WritingFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriterFile implements WritingFile {

    @Override
    public String write(String textWrite) {
        try (FileWriter fileWriter = new FileWriter("Result.txt", false)) {
            fileWriter.write(textWrite);
            fileWriter.flush();
        } catch (IOException ex) {
            System.err.println("Write error.");
        }
        return textWrite;
    }
}