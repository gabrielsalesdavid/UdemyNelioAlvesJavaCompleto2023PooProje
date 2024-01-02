package br.com.generics.estruturasequencial;

public class ExemploExpressAritmet {

    public static void main(String[] args) {

        int number1, number2;
        double result1, result2, result3, result4, result5;

        number1 = 2;
        number2 = 3;

        result1 = number1 * 6 / number2;
        result2 = number2 + number1 * 4;
        result3 = (number2 + number1) * 4;
        result4 = 60 / (number2 + number1) * 4;
        result5 = 60 / ((number2 + number1) * 4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}