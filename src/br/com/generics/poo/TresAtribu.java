package br.com.generics.poo;

import java.util.Locale;
import java.util.Scanner;

public class TresAtribu { //aqui temos uma class declarada. no escopo e chamada tudo o que esta dentro das chaves.

    public static void main(String[] args) { //method vazio. um escopo que funciona algo quando esta dentro da sua chave.

        /*
        Locale, e a formatacao do system de origem. ele formata para idiomas de USA.
        Scanner, e method/class que realiza um scann para coletar dados digitados pelo user e assim setar para o MV.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Triangle declarado com os valores, e uma class.
        os nomes das class recebe o nome da variavel.
         */
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        //double e o tipo de variavel com os valores declarados.
        double p, areaX, areaY;

        /*
        SysOut saida de dados.
        nome da class pegando a variavel declarada que recebe o sc.nextDouble().
         */
        System.out.println("Enter the measures of triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle x: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        //O nome da variavel p recebe a class com as variaveis realizando os calculos.
        p = (x.a + x.b + x.c) / 2.0;
        areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        /*
        if e else, sao estrutura de controle, uma simples e a outra composta.
        dentro do if esta a condicao. apos a chave do if tem o comando.
        esta descrito da seguinte forma: se(a variavel e maior do que a outra), caso seja execute o comando.
        do contrario, entre na outra estrutura e execute o comando.
         */
        if (areaX > areaY) {
            System.out.println("Larger area: X ");
        } else {
            System.out.println("Larger area: Y ");
        }
        sc.close();
    }
}

