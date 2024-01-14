package br.com.generics.topicosavancadosemjava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertDateTime {

    public static void main(String[] args) {

        /*
        LocalDate.parse e LocalDateTime.parse sao calss/method o .parse e um method static que forca/passa
        a formmatacao de uma determinada stringa para obj.
        Instant.parse e um method/class de fuso horario global. o .parse forca/passa a formatacao de uma determinada
        string para obj.
         */
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        /*
        LocalDate.ofInstant e uma class/method local. o .ofInstant passa o obj local para global. Sendo assim o horario
        sera considerado o global.
        ZoneId.systemDefault e um method/class abstract que pega o horario onde o codigo de esta sendo executado.
        .systemDefault e um method static que pega conteudo padrao do sistema.
        ZoneId.of e um method/class static que passsa o dados do sistema local para a determinada delcaracao.
         */
        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));

        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        /*
        SysOut e uma class/method static que return vazio com o nome da variavel/method sendo declarada entre parentes.
        nome da variavel/method.getDayOfMonth e method do tipo primitivo inteiro que pega a quantidade de dias do mes.
        .getMonthValue e um method do tipo inteiro que pega o valor do mes.
        .getYear e um method do tipo primitivo inteiro que pega o ano no sistema.
        .getHour e um method do tipo inteiro que pega o horario no sistema.
        .getMinute e um method do tipo inteiro que pega os minutos no sistema.
         */
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println(d01.getDayOfMonth());
        System.out.println(d01.getMonthValue());
        System.out.println(d01.getYear());

        System.out.println(d02.getHour());
        System.out.println(d02.getMinute());
    }
}