package com.bilgeadam.serialization;

import com.bilgeadam.model.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.UUID;

public class WriteObject {
    public static void main(String[] arg){
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.bin"))){
            Student student1 = new Student("Burak GÜL", UUID.randomUUID().toString(),"Bilgisayar Mühendisi");
            Student student2 = new Student("Burak Duman", UUID.randomUUID().toString(),"Bilgisayar Mühendisliği");
            objectOutputStream.writeInt(123456);
            objectOutputStream.writeObject(student1);
            objectOutputStream.writeObject(student2);
            objectOutputStream.writeBoolean(true);
        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }
    }
}
