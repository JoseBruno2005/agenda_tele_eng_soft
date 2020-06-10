package br.edu.fafic.engsoft.agenda_telefonica.service;

import br.edu.fafic.engsoft.agenda_telefonica.model.ContatoModel;

import java.util.ArrayList;

public class AgendaService {

    ArrayList<ContatoModel> listaContatos = new ArrayList<>();

    boolean addContato(String nome, String numero){
        ContatoModel contatoModel = new ContatoModel(nome, numero);
        try {
            listaContatos.add(contatoModel);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    boolean removeContato(String numero){
        try {
            listaContatos.removeIf(contato -> contato.numero.equals(numero));
            return true;
        }catch (Exception e){
            System.err.print(e);
            return false;
        }
    }

    int total(){
        return listaContatos.size();
    }


}
