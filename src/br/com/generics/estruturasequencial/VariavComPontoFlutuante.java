package br.com.generics.estruturasequencial;

public class VariavComPontoFlutuante {

    public static void main(String[] args) {

        /*
        double e o tipo de variavel e o X e o nome da variavel.
        SysOutPrintLn e a saida de dados com quebra de linha
        SysOutF seria uma formatacao.
        %2/3/4.f seria a quantidade de casa decimais que deseja ser inserido na saida de dados
         */
        double x =10.35784;

        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
    }
}