package com.bilgeadam.logger;

import com.bilgeadam.Workout;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {

    public static void logWorkout(Workout workout){
        try (FileWriter fileWriter = new FileWriter("log.txt",true)){
            fileWriter.write("Tarih-Saat: "+new Date(System.currentTimeMillis()) +" Workout:" + workout.toString()+"\n");
        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }
    }
}
