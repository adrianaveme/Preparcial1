package entities;

import java.util.ArrayList;
import java.util.List;

public class MasterTraining {

    public static final int undefined  = -1;

    private List<Plan> plans;
    private List<Trainer> trainers;
    private List<Cyclist> cyclist;
    private Workout workouts;
    private int HeartBeat;

    public MasterTraining() {
        this.plans = new ArrayList<>();
    }

    /**
     * Setters and getters
     */

    public static int getUndefined() {
        return undefined;
    }

    public List<Plan> getPlans() {
        return plans;
    }

    public void setPlans(List<Plan> plans) {
        this.plans = plans;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    public List<Cyclist> getCyclist() {
        return cyclist;
    }

    public void setCyclist(List<Cyclist> cyclist) {
        this.cyclist = cyclist;
    }

    public Workout getWorkouts() {
        return workouts;
    }

    public void setWorkouts(Workout workouts) {
        this.workouts = workouts;
    }

    /**
     * Determina para un plan específico el rendimiento del corazón del ciclista.
     * Si el corazón presenta latidos irregulares, crea un nuevo plan de tipo “Heart Care” para dicho ciclista.
     *
     * @param number El numero del plan a verificar
     * @return Plan: El nuevo plan creado en caso de necesitarlo, de lo contrario null.
     */
    public Plan checkHeart(long number) {
         if (HeartBeat<90 || HeartBeat>160){

         }

        return null;
    }

    public void addPlan(Plan plan) {
        this.plans.add(plan);
    }

    public int countPlans() {
        return this.plans.size();
    }


}
