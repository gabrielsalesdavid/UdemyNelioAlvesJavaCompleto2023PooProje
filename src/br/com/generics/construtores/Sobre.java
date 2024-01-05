package br.com.generics.construtores;

import java.util.Locale;
import java.util.Scanner;

public class Sobre {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SobCarg sobCar = new SobCarg();

        /*
        Foi realizado a declaracao das variaveis temp na condicao.
        sendo que se fosse depois dos atributos/method Locale e Scanner a condicao nao reconheceria,
        assim foi inserido as variaveis temp depois de cada condicao.
         */
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Price: ");
        double price = sc.nextDouble();

        SobCarg sbc = new SobCarg(name, price);

        System.out.println(name + ", " + price);
        System.out.println(sbc);

        /*
        A class foi declarada por aqui. pois se fosse antes das variaveis e depois do method a condicao
        nao reconheceria. e uma class construtora. assim elemina alguns codigos feitos e deixa tudo centrado nele.
        nomes das variaveis parametrizada no SysOut/Inicializada ela refere a class/atributo SobCarg.
        sendo assim, essa class principal seria o coletor de daods e repasa a outra class que realiza o armezanamento
        dos dados inseridos. como se fosse um BD local!
        Na sobre carga, foi retirado a variavel quantity do method. sendo que o codigo diminuiu um pouco.
        */
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        sbc.addProducts(quantity);

        System.out.println(name + ", " + price + ", " + quantity);
        System.out.println(sbc);

        System.out.println("Enter the number of products to be remove from stock: ");
        quantity = sc.nextInt();
        sbc.removeProducts(quantity);

        System.out.println(name + ", " + price + ", " + quantity);
        System.out.println(sbc);

        sc.close();
    }
}