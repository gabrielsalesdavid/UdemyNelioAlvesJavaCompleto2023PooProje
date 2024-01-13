package br.com.generics.topicosavancadosemjava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataTimeEmJava {

    public static void main(String[] args) {

        /*
        LocalDate.parse, LocalDateTime.parse e do tipo class/method, .parse forca/passa obj declarado para o sistema
        que seja mostrado conforme esta entre parenteses e aspas.
        Instante.parse e do tipo de class que forca/passa um obj declarado para o sistema que seja mostrado conforme
        esta entre parentes e aspas.
         */
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        /*
        DateTimeFormatter e do tipo class/method que formata obj conforme esta declarado entre parenteses e aspas.
        .ofPattern formata obj para string.
        (dd/MM/yyyy HH:mm").withZone(ZoneID.systemDefault()); withZone pega a cronologia do fuso hora da zona local.
        ZoneId e do tipo class abstract e do UTC. Geografic da europa. .systemDefault e do method static que return
        systemDeafult. Ele retorna o horario do sistema em esta sendo executado o comando.
        ISO_DATE_TIME e do tipo method static que converte data e horario em local.
        ISO_INSTANT e tipo de method static que converte o fuso horario para UTC.
         */
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;

        /*
        nome da class/method.format seria para que seja retornado as info
        para o formato que foi declarado pelo Formatter com o parametro Formatter.
         */
        System.out.println(d04.format(fmt01));
        System.out.println(fmt01.format(d04));
        System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(d05.format(fmt01));
        System.out.println(d05.format(fmt02));
        System.out.println(d05.format(fmt04));

        System.out.println(fmt03.format(d06));
    }
}