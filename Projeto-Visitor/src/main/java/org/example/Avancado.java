package org.example;

public class Avancado implements Cliente {

    private int id;
    private String nome;
    private String detalhes;

    public Avancado(int id, String nome, String detalhes) {
        this.id = id;
        this.nome = nome;
        this.detalhes = detalhes;
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }


    public String getDetalhes() {
        return detalhes;
    }


    public String aceitar(Visitor visitor) {
        return visitor.exibirPlanoAvancado(this);
    }
}
