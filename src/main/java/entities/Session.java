package entities;

import java.util.Date;

public class Session {

    private char type;
    private int dayOfweek;
    private Workout workout;
    private Week week;
    private Activity activity;


    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public int getDayOfweek() {
        return dayOfweek;
    }

    public void setDayOfweek(int dayOfweek) {
        this.dayOfweek = dayOfweek;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    /**
     * Setters and getters
     */






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
