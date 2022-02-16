package testealgoritmo;

import java.util.ArrayList;
import java.util.List;

public class RetornoLista {

    public void Solucao() {
        // Dada uma lista de números A[1,2,3,…], faça um algoritmo que 
        // retorne uma lista somente com os números pares.
        List<Integer> A = new ArrayList<Integer>();
        List<Integer> B = new ArrayList<Integer>();
        for (int i = 1; i < 21; i++) {
            A.add(i);
        }
        System.out.println("Lista 1: " + A);
        System.out.println("");
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                B.add(i);
            }
        }
        System.out.println("Lista 2: " + B);
    }
}
