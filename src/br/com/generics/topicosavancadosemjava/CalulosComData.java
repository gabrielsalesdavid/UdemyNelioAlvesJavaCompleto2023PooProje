package br.com.generics.topicosavancadosemjava;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalulosComData {

    public static void main(String[] args) {

        LocalDate ld01 = LocalDate.parse("2022-07-20");
        LocalDateTime ldt01 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant in01 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = ld01.minusDays(7);
        LocalDate nextWeekLocalDate = ld01.plusDays(7);

        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = ldt01.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = ldt01.plusDays(7);

        System.out.println(pastWeekLocalDateTime);
        System.out.println(nextWeekLocalDateTime);

        Instant pastWeekInstant = in01.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = in01.plus(7, ChronoUnit.DAYS);

        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);

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