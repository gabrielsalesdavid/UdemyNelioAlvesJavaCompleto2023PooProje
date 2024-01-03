package br.com.generics.topicosbasicojava;

import java.util.Scanner;

public class OperBitw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, n4, mask, n;
        n1 = 89;
        n2 = 60;
        n3 = 32;
        n4 = 113;

        //nome da variavel mask recebendo o sexto bit valendo um
        mask = 0b100000;
        n = sc.nextInt();

        /*
        Um "E" comercial, significa "&" se apenas uma condicao e verdadeira, se todas as condicoes for tudo falsa/verdadeira,
        a resposta e falsa/verdadeira.
        Um pipeline(|), significa "OU" se uma condicao for verdadeira, a resposta e verdadeira e se for tudo falsa,
        a resposta e falsa.
        Um sircunflexo(^), significa "XOR" se uma condicao for verdadeira e a outra falsa, a resposta e verdadeira,
        se a condicao for tudo falsa/verdadeira, a resposta e falsa.
         */
        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false!");
        }

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

        System.out.println(n3 & n4);
        System.out.println(n3 | n4);
        System.out.println(n3 ^ n4);

        sc.close();
    }
}