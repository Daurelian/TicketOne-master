package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Spettacolo {
    private int id_spettacolo;
    private LocalDateTime data;
    private String nome;
    private double prezzo;
    private LocalTime durata;
    private int id_sala;

    public int getId_spettacolo() {
        return id_spettacolo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public LocalTime getDurata() {
        return durata;
    }

    public int getId_sala() {
        return id_sala;
    }
}
