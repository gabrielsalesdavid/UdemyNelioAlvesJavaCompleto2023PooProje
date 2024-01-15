package br.com.generics.topicosavancadosemjava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalcDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dtNsc;

        dtNsc = sc.nextInt();

        LocalDate dtHj = LocalDate.now();

        LocalDate year = dtHj.minusYears(dtNsc);

        System.out.println(year.format(DateTimeFormatter.ofPattern("yy")));
    }
}