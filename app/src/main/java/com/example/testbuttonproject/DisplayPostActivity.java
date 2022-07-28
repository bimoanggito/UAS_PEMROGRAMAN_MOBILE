package com.example.testbuttonproject;

import com.google.gson.annotations.SerializedName;

public class DisplayPostActivity {
    private int userId;

    private Integer id;

    private String title;

    @SerializedName("body")
    private String text;

    public DisplayPostActivity(int userId, String title, String text) {
        this.userId = userId;
        this.title = title;
        this.text = text;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
