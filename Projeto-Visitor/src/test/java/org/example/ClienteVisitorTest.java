package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteVisitorTest {

    @Test
    void deveExibirPlanoBasico() {
        Basico basico = new Basico(1, "Basico", "Consultas clinicas gerais");
        ClienteVisitor visitor = new ClienteVisitor();
        assertEquals("Plano 1 {nome: 'Basico', detalhes: Consultas clinicas gerais}", visitor.exibir(basico));
    }

    @Test
    void deveExibirPlanoIntermediario() {
        Intermediario intermediario = new Intermediario(2, "Intermediario", "Consultas clinicas gerais e exames laboratoriais");
        ClienteVisitor visitor = new ClienteVisitor();
        assertEquals("Plano 2 {nome: 'Intermediario', detalhes: 'Consultas clinicas gerais e exames laboratoriais'}", visitor.exibir(intermediario));
    }

    @Test
    void deveExibirPlanoAvancado() {
        Avancado avancado = new Avancado(3, "Avancado", "Consultas clinicas gerais, exames laboratoriais e cirurgias");
        ClienteVisitor visitor = new ClienteVisitor();
        assertEquals("Plano 3 {nome: 'Avancado', detalhes: Consultas clinicas gerais, exames laboratoriais e cirurgias}", visitor.exibir(avancado));
    }
}