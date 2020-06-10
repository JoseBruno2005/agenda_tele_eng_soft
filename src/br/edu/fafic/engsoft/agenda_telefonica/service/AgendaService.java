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

    public String buscarContatoNome(String nome){
        for (ContatoModel contato: listaContatos) {
            if(contato.nome.equals(nome)){
                return contato.numero;
            }
        }
        return "Nenhum contato com esse nome";
    }

    public String buscarContatoNumero(String numero){
        for (ContatoModel contato: listaContatos) {
            if(contato.numero.equals(numero)){
                return contato.nome;
            }
        }

        return "Nenhum contato com esse numero";
    }

    public void mostrar(){
        listaContatos.forEach(System.out::println);
    }

}
