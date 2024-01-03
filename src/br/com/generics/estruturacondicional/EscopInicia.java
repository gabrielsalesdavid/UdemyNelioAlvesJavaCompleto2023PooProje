package br.com.generics.estruturacondicional;

public class EscopInicia {

    public static void main(String[] args) {

        /*
        double e o tipo de variavel sendo inicializada com o nome da variavel e por um valor.
        se daclararmos uma variavel dentro de uma estrutura de controle, por si,
        a variavel fica fora do escopo do public static, sendo assim... Temos que declarar as variaveis e inicializar com
        um valor dentro do escopo do method vazio ou dentro de uma estrutura de controle.
        SysOut e a saida de dados!
         */
        double price, discount;
        price = 400.00;

        if (price < 200.00) {
            discount = price * 0.1;
        } else {
            discount = 0.0;
        }
        System.out.println(discount);
    }
}