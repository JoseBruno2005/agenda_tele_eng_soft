package br.edu.fafic.engsoft.agenda_telefonica.service;

import br.edu.fafic.engsoft.agenda_telefonica.model.Contact;

import java.util.List;
import java.util.stream.Collectors;

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

    public String showAllContacts(List<Contact> listOfContacts) {
        return listOfContacts.stream()
                .map(Contact::toString)
                .collect(Collectors.joining("\n"));
    }

    public int totalOfContacts(List<Contact> listOfContacts){
        return listOfContacts.size();
    }
}
