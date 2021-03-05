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


    public double averageBeats(){
        double rab = 0;
        for (Record r: this.records)
            rab += r.getBeats();

        return this.records.size() == 0 ? 0 :  rab /this.records.size();
    }
}
