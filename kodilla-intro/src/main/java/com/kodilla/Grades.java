package com.kodilla;

public class Grades {
    private int[] grades;
    private int size;


    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastAddedGrade() {
        int lastAddedGrade = this.grades[this.grades.length - 1];
        return lastAddedGrade;
    }

    public double calculateAverageGrade() {
        double sumOfGrades = 0;
        for (int i = 0; i < this.grades.length; i++) {
            sumOfGrades += this.grades[i];
        }
        double averageGrade = sumOfGrades / this.grades.length;
        return averageGrade;
    }
}