package com.bilgeadam;

import com.bilgeadam.logger.Logger;

import java.util.Scanner;

public class Workout {

    public Workout() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir antrenman oluştur.");
        System.out.println("Yapılabilecek hareketler:\nBurpee\nPushup\nSitup\nSquat");
        while (true) {
            System.out.print("Hangi hareketi yapmak istiyorsunuz:");
            String workType = scanner.nextLine();
            System.out.print("Bu hareketten kaç tane yapmak istiyorsunuz:");
            int count = scanner.nextInt();
            scanner.nextLine();
            this.setWork(workType,count);
            Logger.logWorkout(this);
            System.out.print("Devam etmek istiyor musunuz? (Evet/Hayır)");
            String isContinue = scanner.nextLine();
            if (!isContinue.equals("Evet")) {
                break;
            }
        }
    }

    public Workout(int burpee, int pushup, int situp, int squat){
        this.burpee = burpee;
        this.pushup = pushup;
        this.squat = squat;
        this.situp = situp;
    }

    private int burpee;
    private int pushup;
    private int situp;
    private int squat;

    public int getBurpee() {
        return burpee;
    }

    public int getPushup() {
        return pushup;
    }

    public int getSitup() {
        return situp;
    }

    public int getSquat() {
        return squat;
    }

    public void setWork(String workType, int count){
        switch (workType) {
            case "burpee":
                this.burpee = count;
                break;
            case "pushup":
                this.pushup = count;
                break;
            case "situp":
                this.situp = count;
                break;
            case "squat":
                this.squat = count;
                break;
            default:
                System.out.println("Böyle bir hareket bulunamaktadır.");
                break;
        }

    }

    public void minusWorkout(String workType, int count){

        switch (workType){
            case "burpee":
                this.burpee = this.burpee - count;
                break;
            case "pushup":
                this.pushup = this.pushup - count;
                break;
            case "situp":
                this.situp = this.situp - count;
                break;
            case "squat":
                this.squat = this.squat - count;
                break;
            default:
                System.out.println("Böyle bir hareket bulunamaktadır.");
                break;
        }


    }

    @Override
    public String toString() {
        return "burpee=" + burpee +
                ", pushup=" + pushup +
                ", situp=" + situp +
                ", squat=" + squat;
    }
}
