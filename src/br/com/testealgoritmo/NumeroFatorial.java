package br.com.testealgoritmo;

import java.util.Scanner;

public class NumeroFatorial {

    public void Solucao() {
        //Faça um algoritmo que receba um número e retorne o Fatorial desse número
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        int r = 1;
        
        if (n == 0) {
            System.out.println("Não existe fatorial de 0");
        } else {
            for (int i = 1; i <= n; i++) {
                r *= i;
            }
            System.out.println(r);
        }

    }
}
