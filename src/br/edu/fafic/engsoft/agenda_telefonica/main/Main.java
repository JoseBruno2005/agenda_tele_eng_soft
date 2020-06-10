package br.edu.fafic.engsoft.agenda_telefonica.main;

import br.edu.fafic.engsoft.agenda_telefonica.controller.AgendaController;
import br.edu.fafic.engsoft.agenda_telefonica.service.AgendaService;

public class Main {
    public static void main(String[] args) {
        AgendaController controller = new AgendaController();

        controller.adicionar("Erlon", "999909409");
        controller.adicionar("Lucas", "999909410");
        controller.adicionar("Davina", "999909411");
        controller.adicionar("Valesca", "999909412");
        controller.adicionar("Mony", "999909413");
        controller.adicionar("Yuri", "999909414");
        controller.mostrarAgenda();

        controller.totalContatos();

        controller.buscar("Erlon", "nome");
        controller.buscar("999909410", "numero");

        controller.remover("Mony", "nome");
        controller.totalContatos();

        controller.remover("999909412", "numero");
        controller.totalContatos();

        controller.mostrarAgenda();


    }
}
