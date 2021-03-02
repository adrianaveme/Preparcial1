package entities;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
/**
 *
 *
 * @author Juan Manuel Calderon, Adriana Maria Velasquez, Daniela Ramirez
 */

public class Cyclist {
    private String email;
    private String name;
    private Date Date;
    private int level;
    private double height;
    private double weight;

    private List <Plan> plans;
    private List <Activity> results;

    /**
     * Setters and getters
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public List<Plan> getPlans() {
        return plans;
    }

    public void setPlans(List<Plan> plans) {
        this.plans = plans;
    }

    public List<Activity> getResults() {
        return results;
    }

    public void setResults(List<Activity> results) {
        this.results = results;
    }
}
