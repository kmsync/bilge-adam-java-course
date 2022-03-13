package com.bilgeadam.fileripper;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try(FileRipper fileRipper = new FileRipper()) {
            System.out.println(fileRipper.definition());
            throw new Exception("Bir exception oluştu.");
        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
