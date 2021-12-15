package com.example.spring.models;

import com.example.spring.ui.Clocking;
import com.example.spring.ui.SavingStatistic;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SaverStatistic implements SavingStatistic {
    Clocking clocking = new Clocker();
    Timestamp timestamp = clocking.getTime();

    @Override
    public List<String> saveStatistic(int vowelsNumber, int consonantsNumber, String vowels, String consonants, String line, String typeInput) {
        List<String> listStatisticsDTO = new ArrayList<>();
        listStatisticsDTO.add(typeInput);
        listStatisticsDTO.add(line);
        listStatisticsDTO.add(String.valueOf(vowelsNumber));
        listStatisticsDTO.add(vowels);
        listStatisticsDTO.add(String.valueOf(consonantsNumber));
        listStatisticsDTO.add(consonants);
        listStatisticsDTO.add(String.valueOf(timestamp));
        return listStatisticsDTO;
    }
}