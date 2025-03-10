package br.edu.fafic.engsoft.agenda_telefonica.controller;

import br.edu.fafic.engsoft.agenda_telefonica.model.Contact;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class ListContactControllerTest {

    List<Contact> contacts = new ArrayList<>();
    SaveContactController saveContactController = new SaveContactController(contacts);
    ListContactController listContactController = new ListContactController(contacts);

    @Test
    public void handleShowContact() {

        String nome = "Layza";
        String numero = "996962681";

        saveContactController.handleSaveContact(nome, numero);
        assertEquals(1,contacts.size());
        assertEquals(nome, contacts.get(0).getName());
        assertEquals(numero, contacts.get(0).getNumber());

        assertEquals(listContactController.handleShowContact(nome, "nome"), "Contato{nome='Layza', numero='996962681'}");

    }

    @Test
    public void handleShowAllContacts() {
        String nome = "Layza";
        String numero = "996962681";

        String nome2 = "Bruno";
        String numero2 = "994572681";

        saveContactController.handleSaveContact(nome, numero);
        assertEquals(1,contacts.size());
        assertEquals(nome, contacts.get(0).getName());
        assertEquals(numero, contacts.get(0).getNumber());

        saveContactController.handleSaveContact(nome2, numero2);
        assertEquals(2,contacts.size());
        assertEquals(nome2, contacts.get(1).getName());
        assertEquals(numero2, contacts.get(1).getNumber());

        String expected = contacts.stream()
                .map(Contact::toString)
                .collect(Collectors.joining("\n"));

        assertEquals(listContactController.handleShowAllContacts(), expected);
    }

    @Test
    public void handleShowTotalOfContacts() {
        String nome = "Layza";
        String numero = "996962681";

        String nome2 = "Bruno";
        String numero2 = "994572681";

        saveContactController.handleSaveContact(nome, numero);
        assertEquals(1,contacts.size());
        assertEquals(nome, contacts.get(0).getName());
        assertEquals(numero, contacts.get(0).getNumber());

        saveContactController.handleSaveContact(nome2, numero2);
        assertEquals(2,contacts.size());
        assertEquals(nome2, contacts.get(1).getName());
        assertEquals(numero2, contacts.get(1).getNumber());

        assertEquals(listContactController.handleShowTotalOfContacts(), 2);
    }
}