package br.com.generics.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vec {

    public static void main(String[] args) {

        /*
        Locale e Scanner, sao class/atributos. o primeiro converte o ASC do teclado para a localidade declarada.
        O Scanner, e um tipo de class/atributo u scanneia dados a ser digitados elo user.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        int, double e String sao variavel do tipo primtivo. Nomes delas, como: number; price, sum, avg; name.
        number e do tipo int. price, sum e avg e do tipo double. name e do tipo String.
        sum recebe 0.0, sendo inicializada com o valor. 0.0 seria do tipo de variavel com casa decimais.
         */
        int number;
        double price, sum, avg;
        String name;

        sum = 0.0;

        /*
        SysOut e a saida de dados.
        Number recebe o sc.nextInt(); que seria o scanner do tipo int.
        VectProduct[], e uma class sendo invocada na class Vec. Os colchetes indica que aquela class e do tipo array.
        vectP e o nome da variavel/class, que recebe ele mesma passando/indicando o number como um array.
         */
        System.out.println("Digite a qauntidade de numeros que deseja: ");
        number = sc.nextInt();
        VectProduct[] vectP = new VectProduct[number];

        /*
        for e uma estrutura de laco de repeticao.
        entre os parenteses seria a condicao. a primeira sendo declarada uma varaivel do tipo int como inicializacao.
        declarando i como o nome da variavel do tipo inteiro recebendo um valor declarado.
        A condicao de i meno(<) que o vectp.length, significa que o valor declarado para number ou que a class recebeu.
        a ultima condicao de i++, sendo que as outras nao for o esperado. caso i for igual a vectp,
        que seria a quantidade digita pelo user for verdadeira ela para de executar o laco e pula as chaves.
        do contrario executa o comando sc.nextLine(), SysOut, name que recebe o sc.nextLine(),
        SysOUt e assim por diante ate que seja o mesmo valor esperado pelas variaveis dentro e fora do for.
        vectP[i] recebe o new VectProduct(name, price); vectP[i] significa na posicao i do tipo array.
        += significa que o nome da variavel esta recebendo ela mesma por outro nome de variavel,
        que seria o vectP[i] indicando o i como valor de um array pegando o preco(getPrice), da class VectProduct.
        avg recebendo sum dividindo o valor do nome da variavel vectP.length.
         */
        for (int i = 0; i < vectP.length; i++) {
            sc.nextLine();
            System.out.println("Digite o produto: ");
            name = sc.nextLine();
            System.out.print("Aperte o enter! ");
            sc.nextLine();
            System.out.println("Digite o preco: ");
            price = sc.nextDouble();
            vectP[i] = new VectProduct(name, price);
        }

        for (int i = 0; i < vectP.length; i++) {
            sum += vectP[i].getPrice();
        }

        avg = sum / vectP.length;
        System.out.printf("Average price = %.2f%n", avg);

        sc.close();
    }
}