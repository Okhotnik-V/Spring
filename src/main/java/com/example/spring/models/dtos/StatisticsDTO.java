package com.example.spring.models.dtos;

import java.sql.Timestamp;

public class StatisticsDTO {
    private int vowelsNumber;
    private int consonantsNumber;
    private String vowels;
    private String consonants;
    private String line;
    private String typeInput;
    private Timestamp timestamp;

    public StatisticsDTO(int vowelsNumber, int consonantsNumber, String vowels, String consonants, String line, String typeInput, Timestamp timestamp) {
        this.vowelsNumber = vowelsNumber;
        this.consonantsNumber = consonantsNumber;
        this.vowels = vowels;
        this.consonants = consonants;
        this.line = line;
        this.typeInput = typeInput;
        this.timestamp = timestamp;
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
