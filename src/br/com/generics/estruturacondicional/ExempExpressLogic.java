package br.com.generics.estruturacondicional;

public class ExempExpressLogic {

    public static void main(String[] args) {

        /*
        int é o tipo de variavel. ja o X seria o nome da variavel.
        X com o sinal de igualdade, significa que ele esta recebendo um valor.
         */
        int x;
        x = 5;

        /*
        if significa uma estrutura(simples) de controle de dados declarada dentro dela. Caso seja o esperado
        o if joga uma mensagem, do contrario ela pula para o else if(composta) ou apenas no else que seria a finalizacao do src.
        !(x == y && b > a || c < z). o sinal de esclamacao(!) significa a negacao de algo na logica de programacao.
        ja o sinal de dupla igualdade(==), significa que um objeto/variaveis é igual a outro.
        Os sinais de "E" comerciais(&&), é uma logica de progamacao, que se resulta apenas se todas as condicoes estao verdadeiras
        Ja o sinais de pipeline duplo(||), significa que apena uma condicao seja verdadeira.
        Os sinais maior e menor(<>), faz com que se uma variavel é menor ou maior do que a outra.
        Ja os sinais menor/maior igual a(<=/>=), significa que tudo que for menor/maior igual a uma variavel.
        o sinasl de esclamacao seguida de igualdade(!=), significa que a variavel/condicoes e diferente.
         */
        if (!(x <= 20 && x == 10)) { //essa logica sem o sinal de esclamacao(!) equivale a falso, sendo assim com o sinal de negacao(!) a logica fica verdadeiro
            System.out.println("É verdadeiro!");
        }
        if (x <= 20 && x == 10) {
            System.out.println("Falso!");
        }
        if (x > 0 && x != 3) {
            System.out.println("Verdadeiro!!");
        }
        if (x <= 20 && x == 10 && x != 3) {
            System.out.println("Falso!");
        }
        if (x == 10 || x <= 20) {
            System.out.println("Verdadeiro!!!");
        }
        if (x > 0 || x != 3) {
            System.out.println("Verdadeiro!!!!");
        }
        if (x <= 20 || x == 10 || x != 3) {
            System.out.println("Verdadeiro!!!!!!");
        }
    }
}