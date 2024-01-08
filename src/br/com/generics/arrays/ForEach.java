package br.com.generics.arrays;

public class ForEach {

    public static void main(String[] args) {

        /*
        String[] e uma class do tipo array. vect seria o nome da variavel/class que recebe a propria class ja
        instanciando os arrays entre as chaves com as declaracoes de String.
        for e um laco de repeticao. entre parentes e as condicoes dentro do for.
        A primeira seria a condicao de inicializacao que executa apenas uma vez, que seria no inicio do for.
        a segunda condicao e com o nome da variavel declarada ja inicializando com o valor zero.
        sendo comparada se ela e menor do que a outra variavel. ou seja, para(for) i menor(<) do que vect.length,
        execute o comando SysOut. ate que ela seja igual ao valor da variavel. vect.length,
        indica que o valor dela ja recebido, ou seja "Maria", "Bob" e "Alex"(0, 1, 2), sendo que o valor zero e
        considerado com o valor um no VM, ficaria 1, 2, 3(0, 1, 2).
         */
        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        /*
        for e um estruta de laca de repeticao.
        entre os parentes seria a condicao para que seja verificado no for. String obj : vect. : significa colecao
        obj e vect e o nome das variaveis declaradas. O vect e do tipo String que e uma class do tipo array.
        E o obj e do tipo String.
         */
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}