package com.example.spring.models;

import com.example.spring.ui.ReadingFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReaderFile implements ReadingFile {
    @Override
    public String read() {
        String fileName = "D:\\User File\\Google D\\Buffer\\Text analysis\\Text.txt";
        String textRead = null;
        try {
            textRead = Files.readString(Paths.get(fileName));
        } catch (IOException e) {
            System.err.println("Read error. Change the content (file type).");
        }
        return textRead;
    }
}
