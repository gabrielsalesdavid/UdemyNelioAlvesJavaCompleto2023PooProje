package br.com.generics.poo;

import java.util.Locale;
import java.util.Scanner;

public class Stock {

    public static void main(String[] args) {

        /*
        Locale e uma class/method que format a donfig de caracters especiais para a localidade de USA.
        Scanner e uma class/method que scanneia dados que serao digitados pelo user.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //int e do tipo inteiro com a inicializacao do nome da variavel.
        int quant;

        //Product e a class sendo inicializada com o nome dela e recebe ela mesmo.
        Product product = new Product();

        /*
        SysOut e a saida de dados.
        product.name. e o nome da class e do atributo que foi inicializada/declarada.
        ele chama a class com o nome do atributo, que recebe o sc.nextLine/Double/Int().
         */
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();

        System.out.println("Price: ");
        product.price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        /*
        SysOut, saida de dados invocando o nome da class de origem com o nome do atributo, concatenando comentarios e
        nome de class/atributo. todos os comentarios devem estar entre aspas dupla.
         */
        System.out.println(product.name + ", " + product.price + ", " + product.quantity);
        System.out.println(product);

        /*
        SysOut, saida de dados.
        quant e nome da variavel do tipo inteiro que recebe sc.nextInt(), que e o scann de dados.
        product.addProducts() e invocado na class Product chamando o method vazio int addProducts.
        addProducts(quant), quant e a indentacao da variavel do tipo inteiro.
        ela passa o que user digitou para a class e o atributo referenciado.
         */
        System.out.println("Enter the number of products to be added in stock: ");
        quant = sc.nextInt();
        product.addProdcuts(quant);

        System.out.println(product.name + ", " + product.price + ", " + product.quantity);
        System.out.println(product);

        System.out.println("Enter the number of products to be remove from stock: ");
        quant = sc.nextInt();
        product.removeProducts(quant);

        System.out.println(product.name + ", " + product.price + ", " + product.quantity);
        System.out.println(product);

        sc.close();
    }
}