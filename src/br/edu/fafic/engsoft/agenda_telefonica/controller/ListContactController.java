package br.edu.fafic.engsoft.agenda_telefonica.controller;

import br.edu.fafic.engsoft.agenda_telefonica.model.Contact;
import br.edu.fafic.engsoft.agenda_telefonica.service.ListContactService;

import java.util.List;

public class ListContactController {
    private List<Contact> listOfContacts;
    private ListContactService listContactService;

    public ListContactController(List<Contact> listOfContacts) {

        this.listOfContacts = listOfContacts;
        this.listContactService = new ListContactService();
    }

    public String handleShowContact(String contact, String token){
        switch (token.toLowerCase()) {
            case "nome":
                return listContactService.showContactByName(contact, listOfContacts).toString();
            case "numero":
                return listContactService.showContactByNumber(contact, listOfContacts).toString();
            default:
                return null;
        }
    }

    public String handleShowAllContacts(){
        return listContactService.showAllContacts(listOfContacts);
    }

    public int handleShowTotalOfContacts(){
        return listContactService.totalOfContacts(listOfContacts);
    }
}
