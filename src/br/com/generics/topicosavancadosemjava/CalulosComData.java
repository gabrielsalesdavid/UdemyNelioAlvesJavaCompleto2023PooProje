package br.com.generics.topicosavancadosemjava;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalulosComData {

    public static void main(String[] args) {

        /*
        LocalDate.parse sao uma class/method. Uma seria final com ISO8601 e a outra static.
        .parse formata o obj na forma que foi declarada entre paraentes e aspas.
        LocalDateTime e uma class/method que coleta como um obj data e hora.
        Instant e uma class/method que retorna a data e hora global. Horario sempre sera o fuso horario global.
         */
        LocalDate ld01 = LocalDate.parse("2022-07-20");
        LocalDateTime ldt01 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant in01 = Instant.parse("2022-07-20T01:30:26Z");

        /*
        nome da class/method recebe nome de outra class/method.minusDays(que subtrai)
        o dia que esta parametreizado entres paranteses.
        .plusDay(soma) o dia que esta em parametro entre parenteses.
         */
        LocalDate pastWeekLocalDate = ld01.minusDays(7);
        LocalDate nextWeekLocalDate = ld01.plusDays(7);

        //SysOut e a saida de dados para user parametrizando o nome da variavel. Ou seja, ele retorna o nome da variavel.
        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);

        /*
        LocalDateTime e uma class/method que retorna data e hora.
        nome da class/method recebe nome de outra class/method.minusDays(que subtrai)
        o dia que esta parametreizado entres paranteses.
        .plusDay(soma) o dia que esta em parametro.
         */
        LocalDateTime pastWeekLocalDateTime = ldt01.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = ldt01.plusDays(7);

        System.out.println(pastWeekLocalDateTime);
        System.out.println(nextWeekLocalDateTime);

        /*
        Instant e uma class/method que retorna data e horario global.
        .minus e um method que subtrai dados do obj que esta parametrizado entre parenteses.
        ChronoUnit.Days e um method. uma retrona data, a outra e static que retorna dias.
        .plus e um method que soma os dado parametrizado.
         */
        Instant pastWeekInstant = in01.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = in01.plus(7, ChronoUnit.DAYS);

        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);

        /*
        Duration.between e uma class/method. uma e a class final e static. que retorna a quantidade do obj.
        .atTime e uma class/method que retorna/converte HH e mm para LocalDateTime.
        .toLocalDate().atTime e uma class/method que convete de datalocal para hora.
        .atStartOfDay() convert para o inicio do dia. ou seja, a meia noite.
         */
        Duration dr01 = Duration.between(pastWeekLocalDate.atTime(0, 0), ldt01.toLocalDate().atTime(0, 0));
        Duration dr02 = Duration.between(pastWeekLocalDateTime, ldt01);
        Duration dr03 = Duration.between(pastWeekInstant, in01);
        Duration dr04 = Duration.between(in01, pastWeekInstant);

        System.out.println(dr01.toDays());
        System.out.println(dr02.toDays());
        System.out.println(dr03.toDays());
        System.out.println(dr04.toDays());
    }
}