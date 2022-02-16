package br.com.testealgoritmo;

import java.util.Scanner;

public class InverterTexto {

    public void Solucao() {
        //Inverter um texto digitado pelo usuário/
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = sc.nextLine();
        String textoTemp = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoTemp += texto.charAt(i);
        }
        System.out.println(textoTemp);
    }
}
