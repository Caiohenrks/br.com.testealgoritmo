package br.com.testealgoritmo;

import java.util.Scanner;

public class VerificarNumeroPrimo {

    public void Solucao() {
        //Faça um algoritmo que receba um número e 
        //retorne se o número é primo ou não.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int n = sc.nextInt();
        int dif = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                dif++;
            }
        }

        if (dif == 1) {
            System.out.println(n + " É primo");
        } else {
            System.out.println(n + " Não é primo");
        }
    }
}
