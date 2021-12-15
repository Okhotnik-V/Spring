package com.example.spring.models;

import com.example.spring.ui.Checking;

import java.util.regex.Pattern;

public class Checker implements Checking {

    @Override
    public String determine(String textDetermine) {
        try {
            boolean resultDetermine;
            if (textDetermine != null && !textDetermine.trim().isEmpty()) {
                resultDetermine = Pattern.matches("[" + "a-z A-Z" + "]" + "*", textDetermine);
            } else {
                resultDetermine = false;
                System.err.println("Error, a sentence is entered that does not meet the requirements");
            }
            boolean correct = false;
            while (correct == false) {
                if (resultDetermine == true) {
                    correct = true;
                } else {
                    System.err.println("Change error. Change the content.");
                    return null;
                }
            }
            return textDetermine;
        } catch (Exception e) {
            System.err.println("Error: Occurred while checking text.");
            return null;
        }
    }
}