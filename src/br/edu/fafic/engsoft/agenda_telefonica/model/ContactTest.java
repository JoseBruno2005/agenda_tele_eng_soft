package br.edu.fafic.engsoft.agenda_telefonica.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest {

    Contact contact = new Contact("Ana", "123456789");

    @Test
    public void testContactConstructor() {
        assertEquals("Ana", contact.getName());
        assertEquals("123456789", contact.getNumber());
    }
    @Test
    public void getName() {
        contact = new Contact("Ana", "123456789");
        assertEquals("Ana", contact.getName());
    }

    @Test
    public void setName() {
        contact.setName("Bruno");
        assertEquals("Bruno", contact.getName());
    }

    @Test
    public void getNumber() {
        contact.setNumber("123456789");
        assertEquals("123456789", contact.getNumber());
    }

    @Test
    public void setNumber() {
        contact.setNumber("123456789");
        assertEquals("123456789", contact.getNumber());
    }

    @Test
    public void testToString() {
        String textoString = "Contato{nome='Ana', numero='123456789'}";
        assertEquals(textoString, contact.toString());
    }
}