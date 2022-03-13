package com.bilgeadam;

public class Main {

    public static void main(String[] args) {
        CalculateGrade calculateGrade = new CalculateGrade();
        calculateGrade.readStudentVisaAndFinalGradeThenWriteCalculatedGrade("student-grade.csv", "student-calculated-grade.txt");
    }

}
