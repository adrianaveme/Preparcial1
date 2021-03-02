package entities;
/**
 * @author Juan Manuel Calderon, Adriana Maria Velasquez, Daniela Ramirez
 */
public class Trainer {
    private String email;
    private String name;

    private Trainer trainer;

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

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}
