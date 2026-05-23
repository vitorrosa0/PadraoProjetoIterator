package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Agencia implements Iterable<Conta> {

    private List<Conta> contas = new ArrayList<Conta>();

    public Agencia(Conta... contas) {
        this.contas = Arrays.asList(contas);
    }


    @Override
    public Iterator<Conta> iterator() {
        return contas.iterator();
    }
}
