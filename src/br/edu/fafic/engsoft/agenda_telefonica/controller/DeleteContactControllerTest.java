package br.edu.fafic.engsoft.agenda_telefonica.controller;

import br.edu.fafic.engsoft.agenda_telefonica.model.Contact;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DeleteContactControllerTest {

    DeleteContactController deleteContactController;
    List<Contact> contacts = new ArrayList<>();
    SaveContactController saveContactController;
    @Test
    public void handleDeleteContactName() {
        saveContactController = new SaveContactController(contacts);
        String nome = "Layza";
        String numero = "998674510";
        saveContactController.handleSaveContact(nome, numero);
        System.out.println("Lista após adicionar contato: " + contacts.size());
        assertEquals(1,contacts.size());

        deleteContactController = new DeleteContactController(contacts);
        deleteContactController.handleDeleteContact(nome, "nome");
        System.out.println("Lista após deletar: " + contacts.size());
        assertEquals(0, contacts.size());

    }

    @Test
    public void handleDeleteContactNumber() {
        saveContactController = new SaveContactController(contacts);
        String nome = "Layza";
        String numero = "998674510";
        saveContactController.handleSaveContact(nome, numero);
        System.out.println("Lista após adicionar contato: " + contacts.size());
        assertEquals(1,contacts.size());

        deleteContactController = new DeleteContactController(contacts);
        deleteContactController.handleDeleteContact(numero,"numero");
        System.out.println("Lista após deletar: " + contacts.size());
        assertEquals(0, contacts.size());

    }
}