package com.bilgeadam;

import com.bilgeadam.logger.Logger;

import java.util.Scanner;

public class WorkoutManager {

    private final Scanner scanner = new Scanner(System.in);

    public void workout(){
        Workout workout = new Workout();
        while (workout.getBurpee() > 0 || workout.getPushup() > 0 || workout.getSitup() > 0 || workout.getSquat() > 0){
            System.out.print("Hangi hareketi yapmak istiyorsunuz: ");
            String workType = this.scanner.nextLine();
            System.out.print("Bu hareketten kaç tane yapmak istiyorsunuz:");
            int count = scanner.nextInt();
            scanner.nextLine();
            workout.minusWorkout(workType,count);
            Logger.logWorkout(workout);
        }
    }

    public void workout(int burpee, int pushup, int situp, int squat){
       Workout workout = new Workout(burpee,pushup,situp,squat);
       Logger.logWorkout(workout);
        while (workout.getBurpee() > 0 || workout.getPushup() > 0 || workout.getSitup() > 0 || workout.getSquat() > 0){
            System.out.print("Hangi hareketi yapmak istiyorsunuz: ");
            String workType = this.scanner.nextLine();
            System.out.print("Bu hareketten kaç tane yapmak istiyorsunuz:");
            int count = scanner.nextInt();
            scanner.nextLine();
            workout.minusWorkout(workType,count);
            Logger.logWorkout(workout);
        }
    }

}
