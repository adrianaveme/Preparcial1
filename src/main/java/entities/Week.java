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

        return this.sessions.size() == 0  ? 0 : sab /this.sessions.size();
    }

    /**
     * Setters and getters
     */

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Duration getRideTime() {
        return rideTime;
    }

    public void setRideTime(Duration rideTime) {
        this.rideTime = rideTime;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }



}
