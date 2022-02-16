package br.com.testealgoritmo;

import java.util.Scanner;

public class MediaIdades {

    public void Solucao() {
        //Dada as idades I, J, K, X, Y. Faça um algoritmo para calcular a média das idades.

        int i, j, k, x, y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade de I: ");
        i = sc.nextInt();
        System.out.println("Digite a idade de J: ");
        j = sc.nextInt();
        System.out.println("Digite a idade de K: ");
        k = sc.nextInt();
        System.out.println("Digite a idade de X: ");
        x = sc.nextInt();
        System.out.println("Digite a idade de Y: ");
        y = sc.nextInt();

        int resultado = (i + j + k + x + y) / 5;

        System.out.println("A média das idades é: " + resultado);
    }

}
