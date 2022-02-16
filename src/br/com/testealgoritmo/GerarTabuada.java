package br.com.testealgoritmo;

import java.util.Scanner;

public class GerarTabuada {

    public void Solucao() {
        //Faça um algoritmo que receba um número e retorne a tabuada desse número.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
