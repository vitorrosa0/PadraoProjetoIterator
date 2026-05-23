package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioTest {

    @Test
    void deveContarContasAtivas() {
        Agencia agencia = new Agencia(
                new Conta(1001, true),
                new Conta(1002, true),
                new Conta(1003, false),
                new Conta(1004, true)
        );
        assertEquals(3, Relatorio.contarContasAtivasAgencia(agencia));
    }

    @Test
    void deveContarTotalContas() {
        Agencia agencia = new Agencia(
                new Conta(1001, true),
                new Conta(1002, true),
                new Conta(1003, false),
                new Conta(1004, true)
        );
        assertEquals(4, Relatorio.contarTotalContasAgencia(agencia));
    }
}