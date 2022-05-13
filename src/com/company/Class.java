package com.company;

import java.util.Arrays;

public class Class {
    private int number;
    private String word;
    private int[] Massiv;

    public Class(int number, String word, int[] massiv) {
        this.number = number;
        this.word = word;
        Massiv = massiv;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getMassiv() {
        return Massiv;
    }

    public void setMassiv(int[] massiv) {
        Massiv = massiv;
    }

    @Override
    public String toString() {
        return "Class{" +
                "number=" + number +
                ", word='" + word + '\'' +
                ", Massiv=" + Arrays.toString(Massiv) +
                '}';
    }
}

