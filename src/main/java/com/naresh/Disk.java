package com.naresh;

public class Disk {

    private String disk;

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "Disk Name: " + disk;
    }
}