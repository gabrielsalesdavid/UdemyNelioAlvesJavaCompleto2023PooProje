
package br.com.generics.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class FormatacaoDeVariaveis {

    public static void main(String[] args) {

        //Scanner é uma class/objeto. E sc é o nome da class
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

        /*
        if seria uma estrutura(simples) de controle variavel/objeto
        == o sinal de igualdade dupla, siginifica a igualdade entre um objeto/variavel
        = ja osinal de igual, significa que um objeto/variavel esta recebendo algo para a declaração.
        += o sinal de soma mais a de igualdade, significa o objeto/variavel esta recebendo ele mesmo para calc
         */
        if (gender == 'F') {
            gender = 'F';
        } else if (gender == 'M') {
            gender = 'M';
        }
        /*
        SysOutF é uma saida formatada em Java.
        \n entre as aspas dupla, é uma quebra de linha.
        o sinal de soma e a concatenação entre variaveis/objetos. Isso na saida de informações ao user
        2./3./8.f seria a quantidade de casas decimais que deseja na saida dos dados.
         */
        System.out.printf("Products: \n" +
                product1 + ", which price is $ " + price1 + "\n" + product2 + ", which price is $ " + price2);

        System.out.println("\n");

        System.out.printf("Record: " + age + " years old, code " +
                code + " and gender: " + gender);

        System.out.println("\n");

        System.out.printf("Measure wich eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);

        //locale é uma class/method especific para formatar os dados com o ponto entre as casas decimais.
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}