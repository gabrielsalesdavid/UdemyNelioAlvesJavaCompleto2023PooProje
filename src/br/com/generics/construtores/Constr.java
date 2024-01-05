package br.com.generics.construtores;

import java.util.Locale;
import java.util.Scanner;

public class Constr {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quant;

        ConstEncad conEnc = new ConstEncad();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        conEnc.name = sc.nextLine();

        System.out.println("Price: ");
        conEnc.price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        conEnc.quantity = sc.nextInt();

        System.out.println(conEnc. name + ", " + conEnc.price + ", " + conEnc.quantity);
        System.out.println(conEnc);

        System.out.println("Enter the number of products to be added in stock: ");
        quant = sc.nextInt();
        conEnc.addProducts(quant);

        System.out.println("Enter the number of products to be remove from stock: ");
        quant = sc.nextInt();
        conEnc.removeProducts(quant);

        System.out.println(conEnc.name + ", " + conEnc.price + ", " + conEnc.quantity);
        System.out.println(conEnc);

        sc.close();
    }
}