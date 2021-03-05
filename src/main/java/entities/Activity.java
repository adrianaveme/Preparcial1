package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity {



    private long id;
    private String comments;
    private double fulfillment;
    private Duration duration;
    private Date date;
    private double distance;

    private Session session;

    private List<Record> records;


    public Activity() {
        this.records = new ArrayList<>();
    }

    public void addRecord(Record record) {
        this.records.add(record);
    }

    /**
     * Setters and getters
     */

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public double getFulfillment() {
        return fulfillment;
    }

    public void setFulfillment(double fulfillment) {
        this.fulfillment = fulfillment;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public double averageBeats(){
        double rab = 0;
        for (Record r: this.records)
            rab += r.getBeats();

        return this.records.size() == 0 ? 0 :  rab /this.records.size();
    }
}
