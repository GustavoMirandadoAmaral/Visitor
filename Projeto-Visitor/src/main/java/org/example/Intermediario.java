package org.example;

public class Intermediario implements Cliente{

    private int id;
    private String nome;
    private String detalhes;

    public Intermediario(int id, String nome, String detalhes) {
        this.id = id;
        this.nome = nome;
        this.detalhes = detalhes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPlanoIntermediario(this);
    }
}
