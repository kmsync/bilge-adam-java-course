package com.bilgeadam;

public class Main {

    public static void main(String[] args) {
        WorkoutManager workoutManager = new WorkoutManager();
        int burpee = 0;
        int pushup = 0;
        int situp = 0;
        int squat = 0;
        for(int i = 0 ; i < args.length ; i++){
            switch (i){
                case 0:
                 burpee = Integer.valueOf(args[i]);
                 break;
                case 1:
                    pushup = Integer.valueOf(args[i]);
                    break;
                case 2:
                    situp = Integer.valueOf(args[i]);
                    break;
                case 3:
                    squat = Integer.valueOf(args[i]);
                    break;
                default:
                    break;
            }

        }
        workoutManager.workout(burpee,pushup,situp,squat);
    }
}
