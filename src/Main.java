import entities.Utente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Utente> utenti= new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/teatro", "postgres", "gatti");
            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery("select nome,cognome from utente");
            while(resultSet.next()){
                String nome=resultSet.getString("nome");
                String cognome= resultSet.getString("cognome");
                System.out.println(nome+" "+ cognome);
                Utente u = new Utente(nome, cognome);
                utenti.add(u);
            }
            Utente f= new Utente("Giggino", "Barboncino", "via non lo si sa n.0","gigginobarboncino@gmgmg.cm" );
            addUtente(f, connection);
            statement.close();
            System.out.println(utenti);
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public static void addUtente(Utente u, Connection connection){
        try {
            PreparedStatement preparedStatement= connection.prepareStatement("INSERT INTO UTENTE (nome,cognome,indirizzo,email) VALUES (?,?,?,?)");
            preparedStatement.setString(1,u.getNome());
            preparedStatement.setString(2,u.getCognome());
            preparedStatement.setString(3,u.getIndirizzo());
            preparedStatement.setString(4,u.getEmail());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}