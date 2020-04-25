package com.example.gumaps.model;

public class Faculty {

    private String name;
    private String subjectCode;
    private String room;

    public Faculty(String name, String subjectCode, String room) {
        this.name = name;
        this.subjectCode = subjectCode;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
