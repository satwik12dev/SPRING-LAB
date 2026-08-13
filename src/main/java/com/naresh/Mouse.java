package com.naresh;

public class Mouse {
    private String Mouse;

    public String getMouse() {
        return Mouse;
    }

    public void setMouse(String cpuName) {
        Mouse = cpuName;
    }

    @Override
    public String toString() {
        return "Mouse Name: " + Mouse;
    }
}
