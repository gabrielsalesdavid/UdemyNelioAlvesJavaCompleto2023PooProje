package br.com.generics.topicosavancadosemjava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataTimeEmJava {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26z");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println(d04.format(fmt01));
        System.out.println(fmt01.format(d04));
        System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(d05.format(fmt01));
        System.out.println(d05.format(fmt02));
        System.out.println(d05.format(fmt04));

        System.out.println(fmt03.format(d06));
    }
}