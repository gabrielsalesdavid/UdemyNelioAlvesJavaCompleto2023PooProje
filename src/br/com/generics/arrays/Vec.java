package br.com.generics.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vec {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number;
        double price, sum, avg;
        String name;

        sum = 0.0;

        System.out.println("Digite a qauntidade de numeros que deseja: ");
        number = sc.nextInt();
        VectProduct[] vectP = new VectProduct[number];

        for (int i = 0; i < number; i++) {
            sc.nextLine();
            name = sc.nextLine();
            price = sc.nextDouble();
            vectP[i] = new VectProduct(name, price);
        }

        for (int i = 0; i < number; i++) {
            sum += vectP[i].getPrice();
        }

        avg = sum / number;
        System.out.printf("Average price = %.2f%n", avg);

        sc.close();
    }
}