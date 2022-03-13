package com.bilgeadam.meric;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("student-grade.csv")))) {
            while (sc.hasNextLine()) {
                String student = sc.nextLine();
                String[] studentInfo = student.split(",");
                int[] studentNotes = convertStudentNotesToInt(studentInfo);
                String letterNote = getLetterNote(studentNotes);

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("student-calculated-grade.txt", true));
                bufferedWriter.write(studentInfo[0] + ": " + letterNote + "\n");
                bufferedWriter.close();
            }
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }

    private static int[] convertStudentNotesToInt(String[] studentInfo) {
        int[] studentNotes = new int[3];
        for (int i = 0; i < studentNotes.length; i++) {
            studentNotes[i] = Integer.parseInt(studentInfo[i + 1]);
        }
        return studentNotes;
    }

    public static String getLetterNote(int[] studentNotes) {
        int average = (int) ((studentNotes[0] + studentNotes[1]) * 0.2 + studentNotes[2] * 0.6);
        if (average <= 55) {
            return "FF";
        } else if (average <= 60) {
            return "FD";
        } else if (average <= 65) {
            return "DD";
        } else if (average <= 70) {
            return "DC";
        } else if (average <= 75) {
            return "CC";
        } else if (average <= 80) {
            return "CB";
        } else if (average <= 85) {
            return "BB";
        } else if (average <= 90) {
            return "BA";
        } else {
            return "AA";
        }

    }
}
