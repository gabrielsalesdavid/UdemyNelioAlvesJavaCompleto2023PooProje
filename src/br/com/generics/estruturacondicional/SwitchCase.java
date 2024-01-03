package br.com.generics.estruturacondicional;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        /*
        Scanner e um method/class que escaneia dados que serao inserido pelo user.
        int/String e o tipo de variavel. Int e do tipo inteiro e String para caracter.
         */
        Scanner sc = new Scanner(System.in);
        int x;
        String dia;

        /*
        SysOut,saida de dados para user.
        x/dia e o nome da variavel.
        switch case e como se fosse o if, porem seria uma expressao. switch(x) o X e uma condicao.
        case seria um dado que possa ser o esperado.
        a variavel dia com o sinal de igualdade, significa que esta recebendo um valor do tipo String.
        break ele pausa o src.
         */
        System.out.println("Digite o dia da semana: ");
        x = sc.nextInt();
        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = " valor invalido";
                break;
        }
        //SysOut e a saida de dados para o user e sc.close encerra o Scann.
        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}