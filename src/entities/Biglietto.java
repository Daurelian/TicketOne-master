package entities;

import java.time.LocalTime;

public class Biglietto {
    private int id_biglietto;
    private int id_utente;
    private int id_posto;
    private LocalTime time;

    public int getId_biglietto() {
        return id_biglietto;
    }

    public int getId_utente() {
        return id_utente;
    }

    public int getId_posto() {
        return id_posto;
    }

    public LocalTime getTime() {
        return time;
    }
}
