package br.com.generics.estruturasequencial;

import java.util.Locale;

public class ConcatVariavel {

    public static void main(String[] args) {

        //double é o tipo de variavel, metros seria o nome do tipo de variavel....
        double metros = 10.35784;

        //Locale.setDefault seria a conversao de dados para a localidade USA.
        Locale.setDefault(Locale.US);

        /*
        SysOutF e a saida de dados formatado concatenando a variavel e a MSG.
        %s seria para txt, f seria ponto flutuante, d inteiro, n quebra de linha.
         */
        System.out.printf("Resultado %s", metros + " Metros.");
    }
}