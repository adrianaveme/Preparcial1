package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Manuel Calderon, Adriana Maria Velasquez, Daniela Ramirez
 */

public class Week {

    private int number;
    private Duration rideTime;
    private String objective;

    private Plan plan;
    private List<Session> sessions;

    public Week() {
        this.sessions = new ArrayList<>();
    }

    public Week(int number, Duration rideTime, List<Session> sessions) {
        this.number = number;
        this.rideTime = rideTime;
        this.sessions = sessions;
    }

    public void registerSession(Session session) {
        this.sessions.add(session);
    }

    public void assingPlan(Plan plan) {
        this.plan = plan;
    }

    public double averageBeats(){

        double sab =0;

        for (Session s: this.sessions){
            double sessionAverageBeats = s.averageBeats();
            if (sessionAverageBeats != 0){
                sab += s.averageBeats();
            }
        }

        return this.sessions.size() == 0 ? 0 : sab /this.sessions.size();
    }

}
