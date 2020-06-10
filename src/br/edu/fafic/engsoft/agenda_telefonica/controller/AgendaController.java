package br.edu.fafic.engsoft.agenda_telefonica.controller;

import br.edu.fafic.engsoft.agenda_telefonica.service.AgendaService;

public class AgendaController {

    AgendaService agendaService = new AgendaService();

    boolean isValid(String value, int minLen){
        return value.length() >= minLen;
    }

    public void adicionar(String nome, String numero){
        if (isValid(nome, 1) && isValid(numero, 9)){
            agendaService.addContato(nome, numero);
        }else{
            System.out.println("Dados invalidos:\n" +
                    "O nome precisa ter 1 ou mais caracteres e" +
                    "o numero precisa ter 9 ou mais caracteres");
        }
    }

    /** remover por token: "nome" ou "numero" */
    public void remover(String value, String token){
        switch (token.toLowerCase()){
            case "nome":
                agendaService.removeContatoNome(value);
                break;
            case "numero":
                agendaService.removeContatoNumero(value);
                break;
            default:
                break;
        }
    }

    /** buscar por token: "nome" ou "numero" */
    public void buscar(String value, String token){
        switch (token.toLowerCase()){
            case "nome":
                System.out.println(agendaService.buscarContatoNome(value));
                break;
            case "numero":
                System.out.println(agendaService.buscarContatoNumero(value));
                break;
            default:
                break;
        }
    }

    public void mostrarAgenda(){
        agendaService.mostrar();
    }

    public void totalContatos(){
        System.out.println("Total de contatos:" + agendaService.total());
    }
}
