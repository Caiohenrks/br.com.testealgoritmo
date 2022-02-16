package br.com.testealgoritmo;

import java.util.Scanner;

public class VerificarNumeroMultiplo {

    public void Solucao() {
        //Faça um algoritmo para apresentar se dois números são múltiplos.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int valor1 = sc.nextInt();
        System.out.println("Digite outro valor:");
        int valor2 = sc.nextInt();

        if (valor1 % valor2 == 0) {
            System.out.println("O valor é multiplo");
        } else {
            System.out.println("O valor não é multiplo");
        }
    }
}
