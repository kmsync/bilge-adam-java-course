package com.bilgeadam.manager;

import com.bilgeadam.FileRipper;

import java.util.Scanner;

public class CopyManager {

    private String fileName;

    private int howMuchCopy;

    public CopyManager() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kopyalamak istediğiniz dosyanın adı nedir? Girdi: ");
        this.fileName = scanner.nextLine();
        System.out.print("Kaç kopya istiyorsunuz? Girdi: ");
        this.howMuchCopy = scanner.nextInt();
    }

    public void fileRipper(FileRipper fileRipper){
        long startDateTime = System.currentTimeMillis();
        fileRipper.readFile(this.fileName);
        while (howMuchCopy > 0){
            //TODO file name'in daha generic bir şekilde ayrılmasını sağlayınız.
            String[] fileNameStrings = fileName.split("\\.");
            fileRipper.copyFile(fileNameStrings[0]+howMuchCopy+"."+fileNameStrings[1]);
            howMuchCopy--;
        }
        long endDateTime = System.currentTimeMillis() - startDateTime;
        System.out.println("Maaliyet: "+endDateTime);
    }


    @Override
    public String toString() {
        return "filename: " + this.fileName + " howMuchCopy: " + howMuchCopy;
    }
}
