package com.example.spring.models;

import com.example.spring.ui.Counting;
import com.example.spring.ui.SavingStatistic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Counter implements Counting {
    private static final Pattern pattern = Pattern.compile("[" + "a A e E i I o O u U y Y" + "]");

    @Override
    public String identify(String textIdentify, String typeInput) {
        try {
            SavingStatistic savingStatistic = (SavingStatistic) new SaverStatistic();
            String vowels = "Vowels: ", consonants = "Consonants: ";
            int vowelsQuantity = 0, consonantsQuantity = 0;
            String replace = textIdentify.replaceAll("\\s+", "");
            char[] textToArray = replace.toCharArray();
            for (int i = 0; i < textToArray.length; i++) {
                Matcher matcher = pattern.matcher(String.valueOf(textToArray[i]));
                if (matcher.find()) {
                    vowelsQuantity++;
                    vowels = vowels + String.valueOf(textToArray[i]) + " ";
                } else {
                    consonantsQuantity++;
                    consonants = consonants + String.valueOf(textToArray[i]) + " ";
                }
            }
            return String.valueOf(savingStatistic.saveStatistic(vowelsQuantity, consonantsQuantity, vowels, consonants, textIdentify, typeInput));
        } catch (Exception e) {
            System.err.println("Error: Occurred while checking vowels and consonants");
            return null;
        }
    }
}