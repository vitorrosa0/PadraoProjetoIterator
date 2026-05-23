package org.example;

import java.util.Iterator;

public class Relatorio {

    public static Integer contarContasAtivasAgencia(Agencia agencia) {
        int quantidade = 0;
        for (Conta conta: agencia) {
            if (conta.isAtiva()) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static Integer contarTotalContasAgencia(Agencia agencia) {
        int quantidade = 0;
        for (Iterator a = agencia.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }

        return quantidade;
    }
}
