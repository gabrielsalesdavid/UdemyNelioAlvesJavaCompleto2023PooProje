package br.com.generics.topicosavancadosemjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class DateJava8 {

    public static void main(String[] args) throws ParseException {

        /*
        SimpleDateFormat e uma class/method que passa como parametro uma data formatada e o time.
        Date() e uma class/method que retorna a data de agora.
        Date(System.currentTimemillis()). e de uma class final e a outra static. Que retorna milesegundos.
        Date(0L) parametriza zero milisegundos;
        (1000L * 60L * 60L * 5L) multiplica por um segundos por um minuto, multiplica para uma hora e cinco horas.
        O L siginifica Long.
         */
        SimpleDateFormat sdf01 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date n01 = new Date();
        Date n02 = new Date(System.currentTimeMillis());
        Date n03 = new Date(0L);
        Date n04 = new Date(1000L * 60l * 60l * 5l);

        /*
        Date recebe o nome da class/method.parse que formata/forca a data parametrizzada.
        Date.from(Instant.parse("yyyy-MM-ddTHH:mm:ssZ"). Instant.parse formata uma data/time global que esta no parametro.
         */
        Date d01 = sdf01.parse("25/06/2018");
        Date d02 = sdf02.parse("25/06/2018 15:42:07");
        Date d03 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf02.format(d01));
        System.out.println(sdf02.format(d02));
        System.out.println(sdf02.format(n01));
        System.out.println(sdf02.format(n02));
        System.out.println(sdf02.format(n03));
        System.out.println(sdf02.format(n04));
        System.out.println(sdf02.format(d03));
    }
}