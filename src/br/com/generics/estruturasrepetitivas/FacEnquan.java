package br.com.generics.estruturasrepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class FacEnquan {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double cels, fahr;
        char resp;

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            cels = sc.nextDouble();
            fahr = 9.0 * cels / 5.0 + 32.0;
            System.out.printf("Equivale em Fahrenheit: %.1f%n", fahr);
            System.out.println("Deseja continuar (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
        sc.close();
    }
}