package br.com.generics.topicosbasicojava;

import java.util.Scanner;

public class Sintaxe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, higher;

        System.out.println("Enter three numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        higher = max(n1, n2, n3);

        showResult(higher);

        sc.close();
    }

    public static int max(int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}