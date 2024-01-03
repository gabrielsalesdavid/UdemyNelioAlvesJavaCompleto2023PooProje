package br.com.generics.estruturasrepetitivas;

import java.util.Scanner;
public class Enquant {

    public static void main(String[] args) {

        //Scanner e um method/class que escaneia dados que sera digitados pelo user.
        Scanner sc = new Scanner(System.in);

        /*
        int e X. int e o tipo de variavel e o X e o nome da variavel que recebe o valor que sera digitado pelo user.
        sc.nextIntescaneia dados do tipo inteiro.
        while e uma estrutura de repeticao que nao se sabe previamente quando sera preciso para repetir uma condicao.
        o nome da variavel sendo comparada se é diferente com o valor declarado.
        nome da variavel recebendo novamente o scann para comparar o que foi digitado, caso seja o esperado ele para.
         */
        int x;
        x = sc.nextInt();
        while (x != 0) {
            x = sc.nextInt();
        }
        sc.close();
    }
}