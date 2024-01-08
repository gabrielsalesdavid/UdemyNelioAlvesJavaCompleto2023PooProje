package br.com.generics.listas;

public class Wrapper {

    public static void main(String[] args) {

        /*
        int e do tipo inteiro que declarado o x/y como representado a variavel do tipo inteiro primitivo.
        nome da variavel recebe(=) o valor isntanciado;
        Integer e uma variavel da class Integer. obj recebe(=) x que recebeu o valor 20. isto seria Wraper.
        ja nome da variavel y que recebe a variavel do tipo inteiro obj, que divide pelo valor instanciado/declarado.
         */
        int x, y;

        x = 20;
        Integer obj = x;
        System.out.println(obj);

        y = obj * 2;
        System.out.println(y);
    }
}