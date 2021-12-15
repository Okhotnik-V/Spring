package com.example.spring.ui;

import java.util.List;

public interface SavingStatistic {
    List<String> saveStatistic(int vowelsNumber, int consonantsNumber, String vowels, String consonants, String line, String typeInput);
}
