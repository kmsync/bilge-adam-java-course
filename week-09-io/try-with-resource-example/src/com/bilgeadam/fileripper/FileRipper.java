package com.bilgeadam.fileripper;

import java.io.Closeable;
import java.io.IOException;

public class FileRipper implements Closeable {

    public String definition(){
        return "Bu sınıf otomatik olarak sonlandırılabilir bir sınıftır.";
    }
    @Override
    public void close() throws IOException {
        System.out.println("Close çalıştı.");
    }
}
