package br.com.generics.poo;

import java.util.Locale;
import java.util.Scanner;

public class TresAtribu {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        double p, areaX, areaY;

        System.out.println("Enter the measures of triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle x: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        p = (x.a + x.b + x.c) / 2.0;
        areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        if (areaX > areaY) {
            System.out.println("Larger area: X ");
        } else {
            System.out.println("Larger area: Y ");
        }
        sc.close();
    }
}