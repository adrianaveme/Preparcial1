package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Juan Manuel Calderon, Adriana Maria Velasquez, Daniela Ramirez
 */

public class Plan {

    private Date date;
    private char type;
    private int level;
    private boolean active;
    private Date [] start;
    private Date [] end;

    private Trainer trainer;
    private Cyclist cyclist;
    private List<ProgressLog> progress;


    public static final int MIN_BEATS = 90;
    public static final int MAX_BEATS = 160;

    private long number;
    private List<Week> weeks;

    public Plan(long number) {
        this.number = number;
        this.weeks = new ArrayList<>();
    }

    /**
     *
     * constructor clase plan DISEÑO III
     */

    public Plan(char type, Cyclist cyclist) {
        this.type = type;
        this.cyclist = cyclist;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setType(char type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date[] getStart() {
        return start;
    }

    public void setStart(Date[] start) {
        this.start = start;
    }

    public Date[] getEnd() {
        return end;
    }

    public void setEnd(Date[] end) {
        this.end = end;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Cyclist getCyclist() {
        return cyclist;
    }

    public void setCyclist(Cyclist cyclist) {
        this.cyclist = cyclist;
    }

    public List<ProgressLog> getProgress() {
        return progress;
    }

    public void setProgress(List<ProgressLog> progress) {
        this.progress = progress;
    }

    public static int getMinBeats() {
        return MIN_BEATS;
    }

    public static int getMaxBeats() {
        return MAX_BEATS;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public List<Week> getWeeks() {
        return weeks;
    }

    public void setWeeks(List<Week> weeks) {
        this.weeks = weeks;
    }

    /**
     * Setters and getters
     */



    public void addWeek(Week week) {
        this.weeks.add(week);
    }

    public long getNumber() {
        return number;
    }

    public char getType() {
        return type;
    }

    public Plan(List<Week> weeks) {
    }

    public void HeartCarePlan(){
        Plan plan = new Plan(weeks);

        //weeks.add(new Week(4, 3600, weeks.getSession()));

    }

    public void  findPlan(){


    }

}
