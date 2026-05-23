package org.example;

public class Conta {

    private int nuConta;
    private boolean ativa;

    public Conta(int nuConta, boolean ativa) {
        this.nuConta = nuConta;
        this.ativa = ativa;
    }

    public int getNuConta() {
        return nuConta;
    }

    public void setNuConta(int nuConta) {
        this.nuConta = nuConta;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
}
