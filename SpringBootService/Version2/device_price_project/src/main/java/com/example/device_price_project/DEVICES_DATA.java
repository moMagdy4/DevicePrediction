package com.example.device_price_project;


import jakarta.persistence.*;

//import javax.persistence.*;

@Entity
@Table(name = "DEVICES_DATA")
public class DEVICES_DATA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "BATTERYPOWER")
    private int batteryPower;

    @Column(name = "BLUE")
    private boolean blue;

    @Column(name = "CLOCKSPEED")
    private double clockSpeed;

    @Column(name = "DUALSIM")
    private boolean dualSim;

    @Column(name = "FC")
    private int fc;

    @Column(name = "FOURG")
    private boolean fourG;

    @Column(name = "INTMEMORY")
    private int intMemory;

    @Column(name = "MDEP")
    private double mDep;

    @Column(name = "MOBILEWT")
    private double mobileWt;

    @Column(name = "NCORES")
    private int nCores;

    @Column(name = "PC")
    private int pc;

    @Column(name = "PXHEIGHT")
    private int pxHeight;

    @Column(name = "PXWIDTH")
    private int pxWidth;

    @Column(name = "RAM")
    private int ram;

    @Column(name = "SCH")
    private int scH;

    @Column(name = "SCW")
    private int scW;

    @Column(name = "TALKTIME")
    private int talkTime;

    @Column(name = "THREEG")
    private boolean threeG;

    @Column(name = "TOUCHSCREEN")
    private boolean touchScreen;

    @Column(name = "WIFI")
    private boolean wifi;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public boolean isBlue() {
        return blue;
    }

    public void setBlue(boolean blue) {
        this.blue = blue;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public boolean isDualSim() {
        return dualSim;
    }

    public void setDualSim(boolean dualSim) {
        this.dualSim = dualSim;
    }

    public int getFc() {
        return fc;
    }

    public void setFc(int fc) {
        this.fc = fc;
    }

    public boolean isFourG() {
        return fourG;
    }

    public void setFourG(boolean fourG) {
        this.fourG = fourG;
    }

    public int getIntMemory() {
        return intMemory;
    }

    public void setIntMemory(int intMemory) {
        this.intMemory = intMemory;
    }

    public double getmDep() {
        return mDep;
    }

    public void setmDep(double mDep) {
        this.mDep = mDep;
    }

    public double getMobileWt() {
        return mobileWt;
    }

    public void setMobileWt(double mobileWt) {
        this.mobileWt = mobileWt;
    }

    public int getnCores() {
        return nCores;
    }

    public void setnCores(int nCores) {
        this.nCores = nCores;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public int getPxHeight() {
        return pxHeight;
    }

    public void setPxHeight(int pxHeight) {
        this.pxHeight = pxHeight;
    }

    public int getPxWidth() {
        return pxWidth;
    }

    public void setPxWidth(int pxWidth) {
        this.pxWidth = pxWidth;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getScH() {
        return scH;
    }

    public void setScH(int scH) {
        this.scH = scH;
    }

    public int getScW() {
        return scW;
    }

    public void setScW(int scW) {
        this.scW = scW;
    }

    public int getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    public boolean isThreeG() {
        return threeG;
    }

    public void setThreeG(boolean threeG) {
        this.threeG = threeG;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
}
