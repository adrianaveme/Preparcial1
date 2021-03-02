package entities;

import java.time.Instant;

public class Record {

    private double speed;
    private int power;
    private Instant time;

    private int beats;

    public Record(int beats) {
        this.beats = beats;
    }

    /**
     * Setters and getters
     */

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public int getBeats() {
        return beats;
    }

    public void setBeats(int beats) {
        this.beats = beats;
    }
}
