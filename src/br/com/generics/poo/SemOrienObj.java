package br.com.generics.poo;

import java.util.Locale;
import java.util.Scanner;

public class SemOrienObj {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        //scanner e uma class/method que escaneia dados. sc e o nome do method.
        Scanner sc = new Scanner(System.in);

        //double e o tipo de variavel que esta declarada o nomes das variaveis.
        double xA, xB, xC, yA, yB, yC, p, areaX, areaY;

        /*
        SysOut e a saida de dados.
        nomes das variaveis recebendo o sc.nextDouble(). ele tem a funcao de coletar dados do tipo double,
        como descreve o nextDouble.
         */
        System.out.println("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of traingle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        /*
        nome da variavel do tipo double, p, recebe as outras variaveis e realiza os calculos.
         */
        p = (xA + xB + xC) / 2.0;
        areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        /*
        SYsOutF e a saida de dados formatada, a letra f significa format.
        O que esta entre aspas dupla e a mensagem e alguns codigos para que seja realizada a formatacao.
        como: %.4f, significa que eu quero que seja feita a saida dos dados com quatro casas decimais.
        ja o %n, e a quebra de linha. sem a necessidade de usar o ln. porem como esta usando o format.
         */
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        /*
        if e else sao estrutura de controle, uma e o simples e a outra e composta.
        nele esta dizendo, se determinada variavel e maior do que a outra, caso seja me mostre uma msg, que seri o SysOut.
        no if que temos e uma condicao. depois das chaves o que temos e comando.
        sc.close(), ele encerra as atividades do scann.
         */
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}