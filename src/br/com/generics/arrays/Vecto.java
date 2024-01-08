package br.com.generics.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vecto {

    public static void main(String[] args) {

        /*
        Locale e Scanner, sao class/atributos. o primeiro converte o ASC do teclado para a localidade declarada.
        O Scanner, e um tipo de class/atributo u scanneia dados a ser digitados elo user.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        int e double, sao tipos de classes. a primeira e do tipo inteiro e a outra e do tipo com casas decimais.
        double[], com colchetes([]) e do tipo array/vector, que separara numero com casas decimais, inteiros, String
        e char, com a quantidade digitada.
         */
        int number;
        double[] vect;
        double sum, avg;

        /*
        SysOut e a saida de dados para o user sem o "PopUp" que se refere ao JOptionPane.
        number, vect e sum, e o nome das variaveis que recebe dados que serao scanneado pela class Scanner sc.
        O vect que recebe o tipo de variavel double com o colchete declarado/instanciado o nmoe da variavel number.
        referencia ele para receber dados que serao armazenados como um array/vector.
        sum, e o nome da variavel do tipo double sem o vector, que recebe o valores zero.zero tipificando que e um double.
         */
        System.out.println("Digite a quantidade de entradas dos numeros de alturas! ");
        number = sc.nextInt();
        vect = new double[number];
        sum = 0.0;

        /*
        a condicao for, seria em portuga para a varaivel do tipo int com o nome i, inicializacao do for.
        para i menor(<) que number execute  comando vect que recebe sc.nextDouble(). para i menor(<) que number
        execute o comando ate que ele seja o valor que o number foi declarado. ou seja. se number for declarado tres,
        a estrutura de repeticao encerara quando i for igual a number.
        sum += vect[i]. =+ significa que o nome da variavel recebe ela mesma somando pelo nome da variavel vect[i] que e
        um array. [i] e o array que possui os dados inseridos nele, ou na posicao i.
        avg, foi declarado depois das estruturas de repeticoes por conta de logica. pois se fosse feito os calc antes
        daria erro de logica.
        avg recebe sum dividido pelo number.
         */
        for (int i = 0; i < number; i++) {
            System.out.println("Digite a altura: ");
            vect[i] = sc.nextDouble();
        } for (int i = 0; i < number; i++) {
            sum += vect[i];
        }
        avg = sum / number;
        System.out.printf("Average Height: %.2f", avg);

        sc.close();
    }
}