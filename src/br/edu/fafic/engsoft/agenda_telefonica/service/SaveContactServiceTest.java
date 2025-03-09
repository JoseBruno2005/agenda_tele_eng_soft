package br.edu.fafic.engsoft.agenda_telefonica.service;
import br.edu.fafic.engsoft.agenda_telefonica.model.Contact;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SaveContactServiceTest {

    SaveContactService saveContactService = new SaveContactService();
    List<Contact> contacts = new ArrayList<>();
    @Test
    public void saveContact() {
        String name = "Ana";
        String number = "123456789";

        saveContactService.saveContact(name, number, contacts);

        assertEquals(1, contacts.size());
        assertEquals(name, contacts.get(0).getName());
        assertEquals(number, contacts.get(0).getNumber());
    }
}