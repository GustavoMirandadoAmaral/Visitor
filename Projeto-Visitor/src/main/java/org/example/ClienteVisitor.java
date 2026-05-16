package org.example;

public class ClienteVisitor implements Visitor{

    public String exibir(Cliente cliente) {
        return cliente.aceitar(this);
    }

    @Override
    public String exibirPlanoBasico(Basico basico) {
        return "Plano " + basico.getId() + " {" +
                "nome: '" + basico.getNome() + '\'' +
                ", detalhes: " + basico.getDetalhes() +
                '}';
    }

    @Override
    public String exibirPlanoIntermediario(Intermediario intermediario) {
        return "Plano " + intermediario.getId() + " {" +
                "nome: '" + intermediario.getNome() + '\'' +
                ", detalhes: '" + intermediario.getDetalhes() + '\'' +
                '}';
    }

    @Override
    public String exibirPlanoAvancado(Avancado avancado) {
        return "Plano " + avancado.getId() + " {" +
                "nome: '" + avancado.getNome() + '\'' +
                ", detalhes: " + avancado.getDetalhes() +
                '}';
    }
}
