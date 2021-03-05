package entities;

import java.util.Date;

public class Session {

    private char type;
    private int dayOfweek;
    private Workout workout;
    private Week week;
    private Activity activity;



    public Date date(){
        return null;
    }

    public void assignActivity(Activity activity)
    {
        this.activity = activity;
    }
    public double average;

    public double averageBeats() {
        double aab = this.activity == null ? 0 : this.activity.averageBeats();
        return aab;
    }
}
