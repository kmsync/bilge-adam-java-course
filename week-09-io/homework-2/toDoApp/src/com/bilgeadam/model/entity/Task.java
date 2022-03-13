package com.bilgeadam.model.entity;

import java.io.Serializable;
import java.util.Date;

public class Task implements Serializable {

    public Task(String id, String title,
                String description, Date dueDate,
                boolean isCompleted, boolean isDeleted) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.isCompleted = false;
        this.isDeleted = false;
    }

    private String id;
    private String title;
    private String description;
    private Date dueDate;
    private boolean isCompleted;
    private boolean isDeleted;
    private String password;
    private int sum;

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

    public void setSum(int sum) {
        this.sum = sum;
    }
}
