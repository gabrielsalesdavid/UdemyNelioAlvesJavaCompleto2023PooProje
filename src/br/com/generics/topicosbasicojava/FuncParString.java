package br.com.generics.topicosbasicojava;

public class FuncParString {

    public static void main(String[] args) {

        int i;
        String original, s01, s02, s03;
        String[] vect;
        original = "abcde FGHIJ klmno PQRST   ";

        //formatar uma String.
        s01 = original.toLowerCase(); //deixa as letras minusculas.
        s02 = original.toUpperCase(); //deixa as letras maiusculas.
        s03 = original.trim(); //remove espaco em branco.

        //recortar uma String.
        s01 = original.substring(02); //(inicio, fim)

        //Substitui uma string.
        s01 = original.replace('a', 'y'); //(Char/String, Char/String)

        //Busca uma string.
        i = original.indexOf("bc"); //LastIndexOf. seria a posicao dos caracters.

        //recortar uma String com base no separador que for informado!
        vect = original.split(" "); //e um vetor/separador de frase que contem espaco em branco.

        System.out.println("Original: - " + original + " - ");
    }
}