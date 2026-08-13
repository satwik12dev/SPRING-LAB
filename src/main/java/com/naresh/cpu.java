package com.naresh;

public class cpu {

    private String CpuName;

    public String getCpuName() {
        return CpuName;
    }

    public void setCpuName(String cpuName) {
        CpuName = cpuName;
    }

    @Override
    public String toString() {
        return "CPU Name: " + CpuName;
    }
}