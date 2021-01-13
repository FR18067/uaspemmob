package com.example.uas;

public class Model {
    private int id;
    private String name;
    private String day;
    private String hour;
    private byte[] image;

    public Model(int id, String name, String day, String hour, byte[] image) {
        this.id = id;
        this.name = name;
        this.day = day;
        this.hour = hour;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
