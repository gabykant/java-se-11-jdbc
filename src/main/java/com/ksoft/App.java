package com.ksoft;

import java.sql.SQLException;
import java.util.List;

import com.ksoft.utils.DBConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! Welcome" );

        Personne personne = new Personne("Tommy", "Eden", 71);
        personne.aboutMe(); 
        
        DBConnection dbConnection = new DBConnection();
        dbConnection.addPersonne(personne);
        List<Personne> personnes = dbConnection.getPersonnes(); 
        for (Personne p : personnes) {
            p.getFirstname();
            p.getLastname();
            p.getAge();
        }
        dbConnection.delete(2);
    }
}
