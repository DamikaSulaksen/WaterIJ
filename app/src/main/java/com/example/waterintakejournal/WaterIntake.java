package com.example.waterintakejournal;

public class WaterIntake {
    private String date;
    private String time;
    private String numGlass;

    public WaterIntake() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNumGlass() {
        return numGlass;
    }

    public void setNumGlass(int numGlass) {
        this.numGlass = numGlass;
    }
}
