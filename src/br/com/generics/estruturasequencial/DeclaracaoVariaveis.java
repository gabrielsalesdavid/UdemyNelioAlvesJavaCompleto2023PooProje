package br.com.generics.estruturasequencial;

import javax.swing.*;

public class DeclaracaoVariaveis {

    public static void main(String[] args) {

        String address, name;
        double height;
        int gender;

        name = JOptionPane.showInputDialog("Digite o seu nome completo: ");
        address = JOptionPane.showInputDialog(" Digite o seu endereço completo: ");

        height = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));

        gender = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));

        JOptionPane.showMessageDialog(null, "Seu nome é: " + name + "Endereço: " + address +
                ", sua altura é: " + height + ", sua idade: " + gender);
    }
}