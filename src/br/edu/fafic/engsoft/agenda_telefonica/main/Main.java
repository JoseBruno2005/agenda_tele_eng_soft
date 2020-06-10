package br.edu.fafic.engsoft.agenda_telefonica.main;

import br.edu.fafic.engsoft.agenda_telefonica.controller.AgendaController;
import br.edu.fafic.engsoft.agenda_telefonica.service.AgendaService;

public class Main {
    public static void main(String[] args) {
        AgendaController controller = new AgendaController();

        controller.remover("jose", "nome");



    }
}
