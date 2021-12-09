package br.edu.fafic.engsoft.agenda_telefonica.service;

import br.edu.fafic.engsoft.agenda_telefonica.model.Contact;

import java.util.List;

public class SaveContactService {
    public void saveContact(String name, String number, List<Contact> listOfContacts){
        Contact contact = new Contact(name, number);
        try {
            listOfContacts.add(contact);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
