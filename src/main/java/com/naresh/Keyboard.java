package com.naresh;

public class Keyboard {
    private String Keyboard;

    public String getCpuName() {
        return Keyboard;
    }

    public void setKeyboard(String cpuName) {
        Keyboard = cpuName;
    }

    @Override
    public String toString() {
        return "Keyboard Name: " + Keyboard;
    }
}
