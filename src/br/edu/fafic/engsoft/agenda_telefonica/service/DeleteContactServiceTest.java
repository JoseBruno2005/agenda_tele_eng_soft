package br.edu.fafic.engsoft.agenda_telefonica.service;

import br.edu.fafic.engsoft.agenda_telefonica.model.Contact;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DeleteContactServiceTest {
    SaveContactService saveContactService = new SaveContactService();
    List<Contact> contacts = new ArrayList<>();

    DeleteContactService deleteContactService = new DeleteContactService();
    String name = "Ana";
    String number = "123456789";
    String name2 = "Bruno";
    String number2 = "987654321";
    @Test
    public void deleteContactByNumber() {
        saveContactService.saveContact(name, number, contacts);
        saveContactService.saveContact(name2, number2, contacts);
        deleteContactService.deleteContactByNumber(number,contacts);
        assertEquals(contacts.size(), 1);
    }

    @Test
    public void deleteContactByName() {
        saveContactService.saveContact(name, number, contacts);
        saveContactService.saveContact(name2,number2, contacts);
        deleteContactService.deleteContactByName(name2, contacts);
        assertEquals(contacts.size(), 1);
    }
}