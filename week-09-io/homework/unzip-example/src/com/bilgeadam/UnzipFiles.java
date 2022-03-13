package com.bilgeadam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipFiles {

    public static void unzip(String zipFilePath, String destinationDir){
        //İçerisine verilen stringin adıyla directory oluşturur.
        new File("unzipOutput").mkdirs();

        try (FileInputStream fis = new FileInputStream(zipFilePath)){
            ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry zipEntry = zis.getNextEntry();

            /**
             * relative path: unzip-example/src/bilgeadam/UnzipFiles.java
             * absolute path: /home/java/documents/git/bilge-adam-java-course/unzip-example/src/bilgeadam/UnzipFiles.java
             */

            while (zipEntry != null){
                String fileName = zipEntry.getName();
                // unzipOutput\README.txt
                File newFile = new File(destinationDir + File.separator + fileName);
                System.out.println("Unzipping to "+newFile.getAbsolutePath());
                new File(newFile.getParent()).mkdirs();

                //File okundu artık yazılması lazım.

                FileOutputStream fos = new FileOutputStream(newFile);
                int len;
                while ((len = zis.read()) > 0){
                    fos.write(len);
                }
                fos.close();
                zis.closeEntry();
                zipEntry = zis.getNextEntry();
            }
            zis.closeEntry();
            zis.close();
        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }
    }
}
