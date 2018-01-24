package com.wiltrahan;

public class Celtics {
    private String name;
    private String position;
    private String height;
    private String school;

    public Celtics(String name, String position, String height, String school) {
        this.name = name;
        this.position = position;
        this.height = height;
        this.school = school;
    }


    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getHeight() {
        return height;
    }

    public String getSchool() {
        return school;
    }


}
