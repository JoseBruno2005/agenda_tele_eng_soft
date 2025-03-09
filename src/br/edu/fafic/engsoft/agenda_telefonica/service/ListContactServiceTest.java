package br.edu.fafic.engsoft.agenda_telefonica.service;

import br.edu.fafic.engsoft.agenda_telefonica.model.Contact;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListContactServiceTest {

    ListContactService listContactService = new ListContactService();
    SaveContactService saveContactService = new SaveContactService();
    List<Contact> contacts = new ArrayList<>();

    String name = "Ana";
    String number = "123456789";

    @Test
    public void showContactByName() {
        saveContactService.saveContact(name, number, contacts);
        assertEquals(listContactService.showContactByName(name, contacts), contacts.get(0));
    }

    @Test
    public void showContactByNumber() {
        saveContactService.saveContact(name, number, contacts);
        assertEquals(listContactService.showContactByNumber(number, contacts), contacts.get(0));
    }

    @Test
    public void testShowAllContacts() {
        saveContactService.saveContact(name, number, contacts);
        String expectedOutput = "Contato{nome='Ana', numero='123456789'}";
        assertEquals(expectedOutput, listContactService.showAllContacts(contacts));
    }

    @Test
    public void totalOfContacts() {
        saveContactService.saveContact(name, number, contacts);
        assertEquals(listContactService.totalOfContacts(contacts), 1);
    }
}