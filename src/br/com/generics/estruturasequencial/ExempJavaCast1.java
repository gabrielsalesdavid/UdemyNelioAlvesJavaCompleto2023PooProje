package br.com.generics.estruturasequencial;

public class ExempJavaCast1 {

    public static void main(String[] args) {

        //int/double e o tipo de variavel
        int a, b;
        double resultado;

        //nome do tipo de variavel recebendo.
        a = 5;
        b = 2;

        /*
        variavel double recebendo o nome do tipo da variavel e divide por uma outra.
        Entre parentes seria um cast para forcar uma conversao de variaveis.
         */
        resultado = (double) a / b;

        //saida de dados da variavel double
        System.out.println(resultado);
    }
}