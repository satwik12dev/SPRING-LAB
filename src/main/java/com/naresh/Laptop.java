package com.naresh;

public class Laptop {

    private cpu c;
    private Keyboard kyc;
    private Mouse m;
    private  Disk d;

    public cpu getCpu() {
        return c;
    }

    public Keyboard getKyc() {
        return kyc;
    }

    public Disk getDisk(){
        return d;
    }

    public void setCpu(cpu c) {
        System.out.println("CPU Called");
        this.c = c;
    }
    public void setKyc(Keyboard kyc) {
        System.out.println("Keyboard Called");
        this.kyc = kyc;
    }

    public void setMouse(Mouse m){
        System.out.println("MOUSE CALLED");
        this.m=m;
    }

    public void setDisk(Disk d){
        System.out.println("DISK CALLED");
        this.d=d;
    }
    public void display() {
        System.out.println(c);
        System.out.println(kyc);
        System.out.println(m);
        System.out.println(d);
    }
}