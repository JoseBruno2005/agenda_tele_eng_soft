package br.edu.fafic.engsoft.agenda_telefonica.model;

public class ContatoModel {
    public String nome;
    public String numero;

    public ContatoModel(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ContatoModel{" +
                "nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
