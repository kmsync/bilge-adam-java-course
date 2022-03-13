package com.bilgeadam.model.dto;

import java.util.Date;

public class TaskDTO {

    public TaskDTO(){

    }

    public TaskDTO(String id, String title,
                   String description, Date dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.isCompleted = false;
        this.isDeleted = false;
    }

    /**
     * Javascript Object Notation
     * {
     *     "id":"",
     *     "title":"",
     *     "password":""
     * }
     */

    private String id;
    private String title;
    private String description;
    private Date dueDate;
    private boolean isCompleted;
    private boolean isDeleted;
    private int a;
    private int b;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
