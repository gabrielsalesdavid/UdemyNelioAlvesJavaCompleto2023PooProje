package br.com.generics.estruturasequencial;

public class FuncMatem {

    public static void main(String[] args) {

        //double e o tipo de variavel
        double x, y, z, A, B, C;

        //x, y, z, A, B e C sao nome s das variaveis que estão declaradas e recebendo os valores.
        x = 3.0;
        y = 4.0;
        z = -5.0;

        //Nomes das variaveis recebendo a raiz quadrada.
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        //SysOut saida de dados com raiz quadrada.
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 " + " = " + C);

        //Variaveis com potenciacao.
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        //SysOut saida de dados com potenciacao.
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        //Variaveis recebendo valor absoluto.
        A = Math.abs(y);
        B = Math.abs(z);
        //SysOut saida de dados com o valo absoluto.
        System.out.println("Valor absoluto de = " + y + " = " + A);
        System.out.println("Valor absoluto de = " + z + " = " + B);
    }
}