package br.com.generics.listas;

public class BoxingUnBox {

    public static void main(String[] args) {

        /*
        int e do tipo inteiro que declarado o x/y como representado a variavel do tipo inteiro primitivo.
        nome da variavel recebe(=) o valor isntanciado;
        object e uma variavel da class boject. obj recebe(=) x que recebeu o valor 20. isto seria boxing.
        ja o unboxing seria nome da variavel, y recebe um casting do tipo inteiro obj,
        faz com que o nome da class/varaivel obj seja convertido a variavel do tipo inteiro.
         */
        int x, y;

        x = 20;
        Object obj = x;
        System.out.println(obj);

        y = (int) obj;
        System.out.println(y);
    }
}