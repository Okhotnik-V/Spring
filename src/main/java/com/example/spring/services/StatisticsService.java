package com.example.spring.services;

import com.example.spring.models.Checker;
import com.example.spring.models.Counter;
import com.example.spring.models.ReaderFile;
import com.example.spring.models.WriterFile;
import com.example.spring.ui.Checking;
import com.example.spring.ui.Counting;
import com.example.spring.ui.ReadingFile;
import com.example.spring.ui.WritingFile;
import org.springframework.stereotype.Service;

@Service
public class StatisticsService {

    ReadingFile readingFile = new ReaderFile();
    Checking checking = new Checker();
    Counting counting = new Counter();
    WritingFile writingFile = new WriterFile();

    public String getTextFile() {
        return readingFile.read();
    }

    public void setResultFile(String resultFile) {
        writingFile.write(resultFile);
    }

    public String getResult(String textInput, String typeInput) {
        String check = checking.determine(textInput);
        return counting.identify(check, typeInput);
    }
}