package com.example.abhi.buttonlayoutdesign;

public class DaysData {
    private String btname;
    private int btnId;

    DaysData(String name, int btnId) {
        btname = name;
        this.btnId = btnId;
    }

    public String getBtname() {
        return btname;
    }

    public int getBtnId() {
        return btnId;
    }
}