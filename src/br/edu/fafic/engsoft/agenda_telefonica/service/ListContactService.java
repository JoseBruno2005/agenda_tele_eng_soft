package br.edu.fafic.engsoft.agenda_telefonica.service;

import br.edu.fafic.engsoft.agenda_telefonica.model.Contact;

import java.util.List;

public class ListContactService {
    public Contact showContactByName(String name, List<Contact> listOfContacts){
        for (Contact contact: listOfContacts) {
            if(contact.getName().equals(name)){
                return contact;
            }
        }
        return null;
    }

    public Contact showContactByNumber(String number, List<Contact> listOfContacts){
        for (Contact contact: listOfContacts) {
            if(contact.getNumber().equals(number)){
                return contact;
            }
        }

        return null;
    }

    public void showAllContacts(List<Contact> listOfContacts){
        listOfContacts.forEach(Contact::toString);
    }

    public int totalOfContacts(List<Contact> listOfContacts){
        return listOfContacts.size();
    }
}
