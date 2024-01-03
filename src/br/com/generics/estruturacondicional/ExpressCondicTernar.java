package br.com.generics.estruturacondicional;

public class ExpressCondicTernar {

    public static void main(String[] args) {

        //double e o ipo da variavel. preco desconto e o nome delas.
        double preco, desconto;

        /*
        nome da variavel recebendo um valor declaravel.
        variavel recebe a outra mas com a expressao condicional ternaria.
        SysOut a saida de dados.
         */
        preco = 34.5;
        desconto = (preco < 20.0) ? preco *0.1 : preco * 0.05;
        System.out.println(desconto);
    }
}