package br.edu.fafic.engsoft.agenda_telefonica.controller;

import br.edu.fafic.engsoft.agenda_telefonica.model.Contact;
import br.edu.fafic.engsoft.agenda_telefonica.service.ListContactService;

import java.util.List;

public class ListContactController {
    private List<Contact> listOfContacts;
    private ListContactService listContactService;

    public ListContactController(List<Contact> listOfContacts) {
        this.listOfContacts = listOfContacts;
    }

    public void handleShowContact(String contact, String token){
        switch (token.toLowerCase()){
            case "nome":
                System.out.println(listContactService.showContactByName(contact, listOfContacts).toString());
                break;
            case "numero":
                System.out.println(listContactService.showContactByNumber(contact, listOfContacts).toString());
                break;
            default:
                break;
        }
    }

    public void handleShowAllContacts(){
        listContactService.showAllContacts(listOfContacts);
    }

    public void handleShowTotalOfContacts(){
        System.out.println("Total de contatos:" + listContactService.totalOfContacts(listOfContacts));
    }
}
