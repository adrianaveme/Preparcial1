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
    private String type;
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
     * @param type 'Heart Care Plan'
     * @param cyclist
     */
    public Plan(String type, Cyclist cyclist) {
        this.type = type;
        this.cyclist = cyclist;
    }

    public void addWeek(Week week) {
        this.weeks.add(week);
    }

    public long getNumber() {
        return number;
    }


    public Cyclist getCyclist() {
        return cyclist;
    }



    public double averageBeats(){

        double wab = 0;
        for (Week w: this.weeks)
            wab += w.averageBeats();
        return this.weeks.size() ==0 ? 0 : wab / this.weeks.size();
    }

}
