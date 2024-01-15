package br.com.generics.topicosavancadosemjava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalcDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dtNsc;

        System.out.println("Digite sua data de nascimento: ");
        dtNsc = sc.nextInt();

        LocalDate dtHj = LocalDate.now();

        LocalDate year = dtHj.minusYears(dtNsc);

        System.out.println("A sua idade e: "
                + year.format(DateTimeFormatter.ofPattern("yy"))
                + " \nVoce nasceu no ano de : "
                + dtNsc
                + "\nEstamos no ano de: "
                + dtHj.format(DateTimeFormatter.ofPattern("yyyy")));
    }
}