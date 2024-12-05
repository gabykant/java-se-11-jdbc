package com.ksoft.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import com.ksoft.Personne;

public class DBConnection {
    
    private Properties properties;

    public DBConnection() {
        properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new FileNotFoundException("Application Properties not found");
            }
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Connection connect() throws SQLException {
        String url = properties.getProperty("db.url");System.out.println(url);
        Properties prop = new Properties();
        prop.setProperty("user", properties.getProperty("db.user"));
        prop.setProperty("password", properties.getProperty("db.password"));
        prop.setProperty("ssl", properties.getProperty("db.ssl")); 
        return DriverManager.getConnection(url, prop);
    }

    public void addPersonne(Personne personne) { 
        String sql = "INSERT INTO personne (firstname, lastname, age) VALUES (?, ?, ?)";
        try(Connection conn = connect(); 
            PreparedStatement preparedStatement = conn.prepareStatement(sql) ) { 
                conn.setAutoCommit(false);
                preparedStatement.setString(1, personne.getFirstname());
                preparedStatement.setString(2, personne.getLastname());
                preparedStatement.setInt(3, personne.getAge());
                preparedStatement.executeUpdate();
                conn.commit();
            } catch(SQLException e) {
                e.printStackTrace();
            }
    }

    public List<Personne> getPersonnes() {
        List<Personne> output = new ArrayList<Personne>();
        try(Connection conn = connect(); 
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT firstname, lastname, age FROM personne")){
                
            while (resultSet.next()) {
                Personne p = new Personne(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3));
                output.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
         
        return output.isEmpty() ? null : output;
    }
}
