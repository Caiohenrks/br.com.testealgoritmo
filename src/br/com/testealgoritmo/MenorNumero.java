package br.com.testealgoritmo;

public class MenorNumero {

    public void Solucao() {

        //Dados três números (a, b, c), faça um algoritmo para mostrar o menor número. 
        int a = 50;
        int b = 40;
        int c = 100;

        if (a < b && a < c) {
            System.out.println("O menor número é A");
        } else if (b < c) {
            System.out.println("O menor número é B");
        } else {
            System.out.println("O menor número é C");
        }

    }

}
