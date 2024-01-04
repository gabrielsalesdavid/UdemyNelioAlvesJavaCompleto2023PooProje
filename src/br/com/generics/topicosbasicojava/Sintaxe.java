package br.com.generics.topicosbasicojava;

import java.util.Scanner;

public class Sintaxe {

    public static void main(String[] args) {

        //Scanner e uma class/method que scanneia algo que sera digitado pelo user no System.in, que seria a entrada.
        Scanner sc = new Scanner(System.in);

        //int e o tipo da variavel. n1, n2 e entre outros sao apenas nomes dasd variaveis.
        int n1, n2, n3, higher;

        /*
        SysOut e a saida de dados que o user recebera.
        nomes das variaveis recebe o sc.nextInt() que scanneia as informacoes do user
         */
        System.out.println("Enter three numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        //higer e do tipo double da variavel que recebe o atributo max com os valores declarados.
        higher = max(n1, n2, n3);

        //showResult e um atributo com o construtor public que te a funcao de mostrar o resultado.
        showResult(higher);

        sc.close();
    }

    /*
    public static int max, seria um atributo que retorna o valor/dados que contem no escopo dele.
    Sendo assim, a estrutura de controle fica restrita no escopo do atributo pertecente a ela e os valor que estao
    declarado entre parentes depois do objeto max e a chave para a comunicacao entre objeto e escopos.
    if, else if sao estrutura de controle simples e composto, o if e a simples.
     */
    public static int max(int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    /*
    public static void main, seria um atributo que retorna vazio.
    tudo que esta neste escopo não possui interligacao com outros escopos.
    apenas oshowResult que pegar e leva todas as informacoes que esta no escopo do atributo e joga no escopo main.
     */
    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}