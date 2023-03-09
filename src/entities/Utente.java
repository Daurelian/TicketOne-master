package entities;

public class Utente {

    private int id_utente;
    private String nome;
    private String cognome;
    private String indirizzo;
    private String telefono;
    private String email;

    public Utente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Utente(String nome, String cognome, String indirizzo,String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.email = email;
    }

    public int getId_utente() {
        return id_utente;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

}
