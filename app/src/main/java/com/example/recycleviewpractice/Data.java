package com.example.recycleviewpractice;

public class Data {

    public static final int TYPE_ITEM = 0;
    public static final int TYPE_HEADER = 1;

    public int type = TYPE_ITEM;
    public String title;
    public String description;
    public int number;

    public Data(int type, String title, String description, int number) {
        this.type = type;
        this.title = title;
        this.description = description;
        this.number = number;
    }

    public int getType() {
        return type;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public int getNumber() {
        return number;
    }
}
