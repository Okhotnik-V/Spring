package com.example.spring.models;

import com.example.spring.models.dtos.StatisticsDTO;
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
        StatisticsDTO statisticsDTO = new StatisticsDTO(vowelsNumber, consonantsNumber, vowels, consonants, line, typeInput, timestamp);
        List<String> listStatisticsDTO = new ArrayList<>();
        listStatisticsDTO.add(statisticsDTO.getTypeInputStatistics());
        listStatisticsDTO.add(statisticsDTO.getLineStatistics());
        listStatisticsDTO.add(Integer.toString(statisticsDTO.getVowelsNumberStatistics()));
        listStatisticsDTO.add(statisticsDTO.getVowelsStatistics());
        listStatisticsDTO.add(Integer.toString(statisticsDTO.getConsonantsNumberStatistics()));
        listStatisticsDTO.add(statisticsDTO.getConsonantsStatistics());
        listStatisticsDTO.add(String.valueOf(statisticsDTO.getTimestampStatistics()));
        return listStatisticsDTO;
    }
}
