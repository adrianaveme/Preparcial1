package entities;

/**
 * @author Juan Manuel Calderon, Adriana Maria Velasquez, Daniela Ramirez
 */

import java.util.Date;

public class ProgressLog {
    private long number;
    private Date date;
    private double fulfillment;

    /**
     * Setters and getters
     */

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getFulfillment() {
        return fulfillment;
    }

    public void setFulfillment(double fulfillment) {
        this.fulfillment = fulfillment;
    }
}
