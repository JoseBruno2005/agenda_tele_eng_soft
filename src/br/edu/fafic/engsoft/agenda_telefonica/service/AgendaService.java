package br.edu.fafic.engsoft.agenda_telefonica.service;

import br.edu.fafic.engsoft.agenda_telefonica.model.ContatoModel;

import java.util.ArrayList;

public class AgendaService {

    ArrayList<ContatoModel> listaContatos = new ArrayList<>();

    public boolean addContato(String nome, String numero){
        ContatoModel contatoModel = new ContatoModel(nome, numero);
        try {
            listaContatos.add(contatoModel);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean removeContatoNumero(String numero){
        try {
            listaContatos.removeIf(contato -> contato.numero.equals(numero));
            return true;
        }catch (Exception e){
            System.err.print(e);
            return false;
        }
    }

    public boolean removeContatoNome(String nome){
        try {
            listaContatos.removeIf(contato -> contato.numero.equals(nome));
            return true;
        }catch (Exception e){
            System.err.print(e);
            return false;
        }
    }

    public int total(){
        return listaContatos.size();
    }

    public String buscarContatoNome(String nome){
        return null;
    }

    public String buscarContatoNumero(String numero){
        return null;
    }

    public ArrayList<ContatoModel> mostrar(){
        return null;
    }

}
