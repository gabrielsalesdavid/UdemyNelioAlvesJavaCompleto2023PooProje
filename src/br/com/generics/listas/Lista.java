package br.com.generics.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

    public static void main(String[] args) {

        /*
        List<String>, e uma interface com parametro do tipo String entre os maiores e menores, que recebe uma class
        do tipo ArrayList.
        list e nome da interface declarada adicionando as String's nos arrays list.
        list.add, seria um array void passando(Index) o parametro 2 do array que sera
        trocado pela String declarada no element.
         */
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Ales");
        list.add("Bob");
        list.add("Anna");

        list.add(2, "Marco");

        System.out.println(list.size());

        /*
        list.remove(passando em String quem deseja remover). list e um tipo List de interface que esta declarado
        o nome da Interface. Entre parenteses esta o dado que eu desejo remover.
        list.removeIf(parametro que deseja remover). x -> x.charAt(0), seria uma expressao lambda. x.charAt(o) o
        parametro zero dentro dos parentes seria a posicao do char que deve ser removidos.
        o sinal e dupla igualdade em programacao significa igualdade de algo.
        .indexOf, seria encontre a String declarada e me traga.
        o list.stream().filter(x -> x.charAt(0) == 'A'). collect(Collectors.toList()).
        .stream(0 e do tipo do Java 8 em diante, ele permite que seja utilizado por uma expressao lambda.
        .filter seria para filtrar.
        (x -> x.charAt(0) == 'A') seria uma expressao lambda.
        .collect(Collectors.toList()) converte para lista. isso acontece por conta do java 8.
         */
        list.remove("Anna");
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
    }
}