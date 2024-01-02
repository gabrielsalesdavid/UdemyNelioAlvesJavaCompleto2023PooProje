
package br.com.generics.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class FormatacaoDeVariaveis {

    public static void main(String[] args) {

        //Scanner é uma class. E sc é o nome da class
        Scanner sc = new Scanner(System.in);
        //String, int, double, boolean, float e char é o tipo de variavel.
        String product1, product2;

        int age, code;
        char gender;
        double price1, price2, measure;

        /*
        SysOut é a saida das infor para user
        nextLine/Int/Double, é a coleta de dados para a variavel declarada, que neste caso é o String/Int/Double
         */
        System.out.println("Digite o primeiro produto: ");
        product1 = sc.nextLine();
        System.out.println("Digite o segundo produto: ");
        product2 = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        age = sc.nextInt();
        System.out.println("Digite o codigo: ");
        code = sc.nextInt();

        System.out.println("Digite a opcao para o sexo: F(Feminino) e M(Masculino)");
        gender = sc.next().charAt(0);//Scanner pegando e convertendo a string para char, parametro zero é sempre
        // a primeira letra que será digitada, não importa a quantidade de caracter escrito

        System.out.println("Digite o valor do primeiro produto: ");
        price1 = sc.nextDouble();
        System.out.println("Digite o valor do segundo produto: ");
        price2 = sc.nextDouble();

        System.out.println("Digite a medicao: ");
        measure = sc.nextDouble();

        if (gender == 'F') {
            gender = 'F';
        } else if (gender == 'M') {
            gender = 'M';
        }
        /*
        SysOutF é uma saida formatada em Java.
         */
        System.out.printf("Products: \n" +
                product1 + ", which price is $ " + price1 + "\n" + product2 + ", which price is $ " + price2);

        System.out.println("\n");

        System.out.printf("Record: " + age + " years old, code " +
                code + " and gender: " + gender);

        System.out.println("\n");

        System.out.printf("Measure wich eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}