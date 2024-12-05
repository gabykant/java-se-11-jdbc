package com.ksoft;

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class PersonneTest {

    @Test
    void testConstructorAndGetters() {
        // Arrange
        Personne personne = new Personne("John", "Doe", 30);

        // Assert
        assertEquals("John", personne.getFirstname(), "Le prénom devrait être 'John'");
        assertEquals("Doe", personne.getLastname(), "Le nom de famille devrait être 'Doe'");
        assertEquals(30, personne.getAge(), "L'âge devrait être 30");
    }

    @Test
    void testSetters() {
        // Arrange
        Personne personne = new Personne("Jane", "Doe", 25);

        // Act
        personne.setFirstname("Alice");
        personne.setLastname("Smith");
        personne.setAge(35);

        // Assert
        assertEquals("Alice", personne.getFirstname(), "Le prénom devrait être 'Alice'");
        assertEquals("Smith", personne.getLastname(), "Le nom de famille devrait être 'Smith'");
        assertEquals(35, personne.getAge(), "L'âge devrait être 35");
    }

    @Test
    void testAboutMeOutput() {
        // Arrange
        Personne personne = new Personne("Bob", "Brown", 40);

        // Capture de la sortie standard
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        personne.aboutMe();

        // Assert
        assertEquals("Je suis Bob Brown. And I am 40" + System.lineSeparator(),
                outContent.toString(), "La sortie 'aboutMe' est incorrecte");
    }
}
