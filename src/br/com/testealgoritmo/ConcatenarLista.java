package br.com.testealgoritmo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatenarLista {

    public void Solucao() {
        // Dada duas lista de números A[1,2,3,4] e B[1,2,5,8], faça um algoritmo que retorne a 
        // concatenação das listas.

        List a = Arrays.asList(1, 2, 3, 4);
        System.out.println("Lista 1: " + a);
        List b = Arrays.asList(1, 2, 5, 8);
        System.out.println("Lista 2: " + b);

        ArrayList r = new ArrayList(a.size() + b.size());

        r.addAll(a);
        r.addAll(b);

        System.out.println("Concatenado: " + r);

    }
}
