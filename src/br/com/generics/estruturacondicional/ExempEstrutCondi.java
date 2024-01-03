package br.com.generics.estruturacondicional;

import java.util.Scanner;

public class ExempEstrutCondi {

    public static void main(String[] args) {

        /*
        Scanner e uma class/method que escaneia dados que serao inseridos pelo user. SC seria o nome da class/method
        int e o tipode varriavel e hora o nome da variavel que recebera o valor, que neste caso seria digitado pelo user
         */
        Scanner sc = new Scanner(System.in);
        int hora;

        /*
        SysOut e a saida de dados para o user.
        sc.nextInt, seria uma coleta de dados da variavel do tipo inteiro.
         */
        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        /*
        if/else if, sao estruturas de controles, uma seria a simples e a outra composta.
        operadores logicos "E" comercial(&&) e sinais de comparacoes <>, <=, >= e !=.
        Menor/Maior e Menor/Maior igual a e o diferente.
         */
        if (hora >= 05 && hora <= 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 13 && hora <= 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
        sc.close();
    }
}