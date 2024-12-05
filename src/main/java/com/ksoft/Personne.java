package com.ksoft;
import java.io.*;

public class Personne {
    
    private int id;
    private String firstname;
    private String lastname;
    private int age;

    public Personne() {}

    public Personne(String firstname, String lastname, int age ) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Personne(String firstname, String lastname, int age , int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setFirstname(String name) {
        this.firstname = name;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setLastname(String name) {
        this.lastname = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void aboutMe() {
        System.out.println("Je suis " + this.firstname + " " + this.lastname + ". And I am " + this.age);
    } 
}
