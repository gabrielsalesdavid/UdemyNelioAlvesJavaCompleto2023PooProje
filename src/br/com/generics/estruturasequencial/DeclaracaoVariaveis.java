package br.com.generics.estruturasequencial;

import javax.swing.*;

public class DeclaracaoVariaveis {

    public static void main(String[] args) {

        //String, double, int, char, float e boolean é o tipo de vaiavel.
        String address, name;
        double height;
        int gender;

        //input é a entrada de dados que certa varival recebra pelo user.
        name = JOptionPane.showInputDialog("Digite o seu nome completo: ");
        address = JOptionPane.showInputDialog(" Digite o seu endereço completo: ");

        height = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));

        gender = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));

        //if seria a comparacao de variaveis/objeto. Dado o experado a resposta sera a correspondente.
        if (name.equals("Gabriel Sales David") || name.equals("gabriel sales david")) {
            JOptionPane.showMessageDialog(null, "");
        }

        //JOptionPane é uma class/method que seria o input para user
        JOptionPane.showMessageDialog(null, "Seu nome é: " + name + "Endereço: " + address +
                ", sua altura é: " + height + ", sua idade: " + gender);
    }
}