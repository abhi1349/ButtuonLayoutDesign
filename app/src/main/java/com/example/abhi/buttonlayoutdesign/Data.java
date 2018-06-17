package com.example.abhi.buttonlayoutdesign;

public class Data {
    private String btname;
    private int btnId;

    Data(String name, int btnId) {
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