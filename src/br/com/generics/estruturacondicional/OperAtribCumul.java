package br.com.generics.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class OperAtribCumul {

    public static void main(String[] args) {

        /*
        Locale seira uma configuracao de sinais.
        Scanner, e um method/class que escaneia dados pelo user.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        //int e double e o tipo de variavel, minutos/conta e o nome da variavel.
        int minutos;
        double conta;

        /*
        SysOut seria a saida de dados para user.
        nomes das variaveis recebendo dados pelo user e valor decalravel.
         */
        System.out.println("Quantos minutos?");
        minutos = sc.nextInt();
        conta = 50.0;

        /*
        if e uma estrutura de controle simples .
        nome da variavel comparando o valor declarado.
        variavel recebendo ela mesma e realizando calculos com outra variavel e valor declarado.
         */
        if (minutos > 100) {
            conta += (minutos - 100) / 2.0;
        }
        //Sysout saida de dados para o user. sc.close() encerra o Scanner.
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        sc.close();
    }
}