package br.com.generics.estruturasrepetitivas;

import java.util.Scanner;

public class Para {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //e usado para scanneia os dados.

        int n, soma, x; //tipo e nomes das variaveis inicializada.

        n = sc.nextInt(); //nome da varaivel recebendo o scann.
        soma = 0; //variavel recebendo o valor declarado.

        for (int i = 0; i < n; i++) { //Estrutura de repeticao quando uma condicao for verdadeira
            x = sc.nextInt();
            soma += x; //nome da variavel recebendo ela mesma com uma outra variavel. += sinal de atribuicao acumulativa.
        }
        System.out.println(soma);
        sc.close();
    }
}