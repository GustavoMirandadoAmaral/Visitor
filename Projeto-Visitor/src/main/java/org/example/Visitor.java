package org.example;

public interface Visitor {

    String exibirPlanoBasico(Basico basico);
    String exibirPlanoIntermediario(Intermediario intermediario);
    String exibirPlanoAvancado(Avancado avancado);
}
