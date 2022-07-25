package com.bilgeadam.model.aggreagation;

public class Classroom {
    private Student student;

    public Classroom(Student student){
        this.student = student;
    }

    @Override
    public String toString(){
        return this.student.getName() + " " + this.student.getSurname();
    }
}
