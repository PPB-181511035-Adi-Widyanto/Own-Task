package com.example.owntask;

public class Card {

    private String TaskName;
    private String Description;
    private int Photo;

    public Card() {

    }

    public Card(String taskName, String description, int photo) {
        TaskName = taskName;
        Description = description;
        Photo = photo;
    }

    //getter
    public String getTaskName() {
        return TaskName;
    }

    public String getDescription() {
        return Description;
    }

    public int getPhoto() {
        return Photo;
    }

//setter

    public void setTaskName(String taskName) {
        TaskName = taskName;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
