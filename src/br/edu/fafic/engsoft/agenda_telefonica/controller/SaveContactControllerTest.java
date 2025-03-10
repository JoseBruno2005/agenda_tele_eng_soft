package br.edu.fafic.engsoft.agenda_telefonica.controller;

import br.edu.fafic.engsoft.agenda_telefonica.model.Contact;
import br.edu.fafic.engsoft.agenda_telefonica.service.SaveContactService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SaveContactControllerTest {
    SaveContactController saveContactController;
    List<Contact> contacts = new ArrayList<>();
    @Test
    public void saveContactController(){
        saveContactController = new SaveContactController(contacts);
        String nome = "Layza";
        String numero = "996962681";

        saveContactController.handleSaveContact(nome, numero);

        assertEquals(1,contacts.size());
        assertEquals(nome, contacts.get(0).getName());
        assertEquals(numero, contacts.get(0).getNumber());
    }
    @Test
    public void handleSaveContact() {
        saveContactController = new SaveContactController(contacts);
        String nome = "Bruno";
        String numero = "997864513";
        saveContactController.handleSaveContact(nome,numero);
        assertEquals(1,contacts.size());
        assertEquals(nome, contacts.get(0).getName());
        assertEquals(numero, contacts.get(0).getNumber());
    }

    @Test
    public void handleNotSaveContactNameIsEmpty(){
        saveContactController = new SaveContactController(contacts);
        saveContactController.handleSaveContact("", "123456789");
        assertEquals(0, contacts.size());
    }

    @Test
    public void handleNotSaveContactIsEmpty(){
        saveContactController = new SaveContactController(contacts);
        saveContactController.handleSaveContact("", "");
        assertEquals(0, contacts.size());
    }
    @Test
    public void handleNotSaveContactNumberIsEmpty(){
        saveContactController = new SaveContactController(contacts);
        saveContactController.handleSaveContact("Ana", "");
        assertEquals(0, contacts.size());
    }

    @Test
    public void handleNotSaveContactNumber(){
        saveContactController = new SaveContactController(contacts);
        saveContactController.handleSaveContact("Ana", "12");
        assertEquals(0, contacts.size());
    }
}