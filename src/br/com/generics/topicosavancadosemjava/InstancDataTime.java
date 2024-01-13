package br.com.generics.topicosavancadosemjava;

import javax.swing.text.DateFormatter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstancDataTime {

    public static void main(String[] args) {

        /*
        DateTimeFormatter e um tipo de class/method que formata a data e o horario conforme o dev gostaria.
        fmt01/02 e o nome do tipo da class/method. ele converte de String para obj.
        o nome da class/method que recebe a class/method que formata para um objeto do tipo string.
        ("dd/MM/yyyy 00:00:00") e a formatacao do tipo padrao dia, mes e ano("dia/MES/ano"). ("00:00:00")Hora:minutos:segundos.
         */
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        /*
        LocalDate.now() e do tipo class/method que pega no sistema a data exata do momento que sera executado o camando.
        LocalDateTime.now() e do tipo class/method que pega no sistema a data e o horario exato do momento que
        sera executado o comando.
        Instant.now() e uma class que pega horario e data da europa. Fuso horaio global.
         */
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        /*
        As class/method LocalDate.parse e LocalDateTime.parse passa/forca o que o sistema seja mostardo no SysOut
        os carcters declarado entre parentes e aspas dupla.
        Instant.parse e do tipo class que passa/forca o sistema mostrar a data e o horario seja o que foi declarado
        entre parenteses e aspas dupla. .parse e method do tipo static e e uma sobrecarga.
        LocalDate.of LocalDateTime.of sao do tipo class que o .of passa o objeto isoladamente.
        ("yyyy-MM-ddT00:00:00-03:00") -03:00 esta solicitando o fuso horario Sao Paulo.
         */
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt01);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt02);
        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        //toString chama o toString do obj e gera o texto ISO 8601.
        System.out.println(d01.toString());
        System.out.println(d02.toString());
        System.out.println(d03.toString());
        System.out.println(d04.toString());
        System.out.println(d05.toString());
        System.out.println(d06.toString());
        System.out.println(d07.toString());
        System.out.println(d08.toString());
        System.out.println(d09.toString());
        System.out.println(d10.toString());
        System.out.println(d11.toString());
    }
}