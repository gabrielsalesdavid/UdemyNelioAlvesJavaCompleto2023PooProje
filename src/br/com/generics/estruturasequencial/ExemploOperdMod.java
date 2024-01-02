package br.com.generics.estruturasequencial;

public class ExemploOperdMod {

    public static void main(String[] args) {
        int number1, number2;
        double result1, result2;

        number1 = 14;
        number2 = 19;

        result1 = number1 % 3;
        result2 = number2 % 5;

        //SysOut
        System.out.println(result1);
        System.out.println(result2);

        /*
        JOptionPane:

        JOptionPane.showMessageDialog(null, result1);
        JOptionPane.showMessageDialog(null, result2);
         */
    }
}