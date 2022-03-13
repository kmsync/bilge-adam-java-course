package com.bilgeadam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CalculateGrade {

    public void readStudentVisaAndFinalGradeThenWriteCalculatedGrade(String studentGradeFileName, String studentGradeCalculatedFileName){
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(studentGradeFileName)))){
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(studentGradeCalculatedFileName,true));
            while (scanner.hasNext()){
                String student = scanner.nextLine();
                String[] splittedStudent = student.split(",");
                Integer visa1 = Integer.valueOf(splittedStudent[1]);
                Integer visa2 = Integer.valueOf(splittedStudent[2]);
                Integer finalGrade = Integer.valueOf(splittedStudent[3]);
                fileWriter.write(this.calculateGrade(splittedStudent[0],visa1,visa2,finalGrade));
            }
            fileWriter.close();

        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }
    }

    private String calculateGrade(String studentName, Integer visa1, Integer visa2, Integer finalGrade){

        String result = studentName;

        double sumGrade = (visa1 * 2 /10.0) + (visa2 * 2 /10.0) + (finalGrade * 6 / 10.0);

        if(sumGrade >= 90){
            result += " bu dersten AA aldı.";
        }else if (sumGrade >= 85){
            result += " bu dersten BA aldı.";
        }else if (sumGrade >= 80) {
            result += " bu dersten BB aldı.";
        } else if (sumGrade >= 75) {
            result += " bu dersten CB aldı.";
        } else if (sumGrade >= 70) {
            result += " bu dersten CC aldı.";
        } else if (sumGrade >= 65){
            result += " bu dersten DC aldı.";
        } else if(sumGrade >= 60){
            result += " bu dersten DD aldı.";
        }else if (sumGrade >= 55){
            result += " bu dersten FD aldı.";
        }else {
            result += " bu dersten FF aldı.";
        }
        return result+"\n";
    }
}
