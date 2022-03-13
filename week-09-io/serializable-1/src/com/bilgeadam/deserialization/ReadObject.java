package com.bilgeadam.deserialization;

import com.bilgeadam.model.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

    public static void main(String[] args){
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.bin"))){
            int a = objectInputStream.readInt();
            System.out.println("Integer değer: "+a);
            Student student1 = (Student) objectInputStream.readObject();
            System.out.println("Student 1: "+ student1);
            Student student2 = (Student) objectInputStream.readObject();
            System.out.println("Student 2: "+student2);
            boolean isTrue = objectInputStream.readBoolean();
            System.out.println(isTrue);
        }catch (FileNotFoundException fileNotFoundException){
            System.err.println(fileNotFoundException.getMessage());
        }catch (IOException ioException){
            System.err.println("IO Exception Oluştu. "+ioException.getMessage());
        }catch (ClassNotFoundException classNotFoundException){
            System.err.println("Class not found exception");
        }
    }
}
