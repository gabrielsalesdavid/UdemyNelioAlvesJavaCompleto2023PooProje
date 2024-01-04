package br.com.generics.poo;

import java.util.Locale;
import java.util.Scanner;

public class MembEstat {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radius, c, v;

        System.out.println("Enter radius: ");
        radius = sc.nextDouble();

        c = Calcu.circunference(radius);
        v = Calcu.volume(radius);


        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Valume: %.2f%n", v);
        System.out.printf(" PI value: %.2f%n", Calcu.PI);

        sc.close();
    }
}