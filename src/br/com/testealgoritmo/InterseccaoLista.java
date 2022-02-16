package br.com.testealgoritmo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InterseccaoLista {

    public void Solucao() {
        //Dada duas lista de números A[1,2,3,4] e B[1,2,5,8], faça um algoritmo que retorne a 
        //intersecção das listas        
        
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        System.out.println("Set1: " + s1);
        List list = Arrays.asList(1, 2, 5, 8);
        Set<Integer> s2 = new HashSet<>(list);
        System.out.println("Set2: " + s2);
        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println("Intersection: " + intersection);
    }
}
