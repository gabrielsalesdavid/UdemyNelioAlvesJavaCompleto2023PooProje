package br.com.generics.topicosavancadosemjava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalcDate {

    public static void main(String[] args) {

        /*
        Scanner e uma class/method do tipo primitivo que scanneia dados que sera digitados.
        int e o tipo de variavel do tipo primitivo.
        SysOut e a saida de dados para user.
        dtNsc e nome da variavel do tipo inteiro que recebe o nome da variavel/method sc que scanneia os dados.
         */
        Scanner sc = new Scanner(System.in);

        int dtNsc;

        System.out.println("Digite sua data de nascimento: ");
        dtNsc = sc.nextInt();

        /*
        LocalDate e uma class/method ISO8601 que mostra a data local do sistema.
        LocalDate.now pega as informacoes de data do momento em que o comando esta sendo executado.
        LocalDate yeaer recebe o nome da variavel/method .minusYear(nome da variavel)
        que recebeu os dados que user digiou.
        .minusYear(nome da variavel) passa como o parametro 0 (dtNsc) e pega o ano - o dados que foi digitado pelo user.
        SysOut e a saida de dados que inclementa os nomes das variaveis e os comentarios.
        year.format(DateTimeFormatter.ofPattern("a formatacao que deseja inserir"). o .format e um method static que
        formata o obj no formato que deseja. passando como parametro DateTimeFormatter.ofPattern("").
        DateTimeFormtter e um method/obj que formata sem a necessidade de declaracao de variaveis.
        .ofPattern("") e um method static que passa para o parametro da formatacao("").
         */
        LocalDate dtHj = LocalDate.now();

        LocalDate year = dtHj.minusYears(dtNsc);

        System.out.println("A sua idade e: "
                + year.format(DateTimeFormatter.ofPattern("yy"))
                + "\nVoce nasceu no ano de: "
                + dtNsc
                + "\nEstamos no ano de: "
                + dtHj.format(DateTimeFormatter.ofPattern("yyyy")));
    }
}