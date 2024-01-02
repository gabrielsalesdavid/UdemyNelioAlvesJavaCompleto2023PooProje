package br.com.generics.estruturasequencial;

import javax.swing.*;

public class ExpressoesAritmeticas {

    public static void main(String[] args) {

        /*
        int, String, double, float e boolean sao os tipos de variaveis em java.
        diante deles, sao os nomes das variavis e o que ela esta recebendo.
         */
        int calc1, calc2, calc3, expres;
        float result;

        expres = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1(um) para a expressão multiplicações: \n" +
                "Digite o número 2(dois) para a expressão divisões: \n " +
                "Digite o numero 3(três) para a expressão soma: \n" +
                "Digite o numero 4(quatro) para a expressão subtração: "));

        /*
        if compara objeto/variaveis para que seja feita a resposta do que e esperado.
        JOption.showMessDia e uma caixa de dialogo que é emitida para o user!
        integer.parseInt passa/converte uma string para inteiro
         */
        if (expres == 1) {
            calc1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor a ser calculado: "));
            calc2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor a ser calculado: "));
            calc3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor a ser calculado: "));

            result = calc1 * calc2 * calc3;
            JOptionPane.showMessageDialog(null, result);

        } else if (expres == 2) {
            calc1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor a ser calculado: "));
            calc2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor a ser calculado: "));
            calc3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor a ser calculado: "));

            result = calc1 / calc2 / calc3;
            JOptionPane.showMessageDialog(null, result);

        } else if (expres == 3) {
            calc1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor a ser calculado: "));
            calc2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor a ser calculado: "));
            calc3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor a ser calculado: "));

            result = calc1 - calc2 - calc3;
            JOptionPane.showMessageDialog(null, result);

        } else if (expres == 4) {
            calc1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor a ser calculado: "));
            calc2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor a ser calculado: "));
            calc3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor a ser calculado: "));

            result = calc1 + calc2 + calc3;
            JOptionPane.showMessageDialog(null, result);
        }
    }
}