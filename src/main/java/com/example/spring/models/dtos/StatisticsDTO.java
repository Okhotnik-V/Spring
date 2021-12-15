package com.example.spring.models.dtos;

import java.sql.Timestamp;

public class StatisticsDTO {

    private long id;
    private int vowelsNumber;
    private int consonantsNumber;
    private String vowels;
    private String consonants;
    private String line;
    private String typeInput;
    private Timestamp timestamp;

    public long getIdNumberStatistics() {
        return id;
    }

    public int getVowelsNumberStatistics() {
        return vowelsNumber;
    }

    public void setVowelsNumberStatistics(int vowelsNumber) {
        this.vowelsNumber = vowelsNumber;
    }

    public int getConsonantsNumberStatistics() {
        return consonantsNumber;
    }

    public void setConsonantsNumberStatistics(int consonantsNumber) {
        this.consonantsNumber = consonantsNumber;
    }

    public String getVowelsStatistics() {
        return vowels;
    }

    public void setVowelsStatistics(String vowels) {
        this.vowels = vowels;
    }

    public String getConsonantsStatistics() {
        return consonants;
    }

    public void setConsonantsStatistics() {
        this.consonants = consonants;
    }

    public String getLineStatistics() {
        return line;
    }

    public void setLineStatistics() {
        this.line = line;
    }

    public String getTypeInputStatistics() {
        return typeInput;
    }

    public void setTypeInput(String typeInput) {
        this.typeInput = typeInput;
    }

    public Timestamp getTimestampStatistics() {
        return timestamp;
    }

    public void setTimestampStatistics() {
        this.timestamp = timestamp;
    }
}
