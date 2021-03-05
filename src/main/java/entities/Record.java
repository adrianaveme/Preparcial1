package entities;

import java.time.Instant;


/**
 * Esta clase representa un resgistro del atleta.
 * beats no puede ser nunca menor a 30
 */

public class Record {

    private double speed;
    private int power;
    private Instant time;

    private int beats;

    public Record(int beats) {
        this.beats = beats;
    }

    /**
     * Setters and getters
     */


    public int getBeats() {
        return this.beats;
    }

}
