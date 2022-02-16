package br.com.testealgoritmo;

import java.util.Scanner;

public class VerificarPalindromo {

    public static void main(String[] args) {
        //Inverter um texto digitado pelo usuário/
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = sc.nextLine().toLowerCase();
        String textoTemp = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoTemp += texto.charAt(i);
        }

        if (texto.equals(textoTemp)) {
            System.out.println("É Palindromo: ");
            System.out.println(texto);
            System.out.println("");
        } else {
            System.out.println("Não é Palindromo");
            System.out.println("Texto: " + texto);
            System.out.println("Inverso: " + textoTemp);
            System.out.println("");
        }
    }
}
