package br.com.generics.estruturasequencial;

public class ExemploOperdMod {

    public static void main(String[] args) {
        //int/double é o tipo de variavel. number1/2 e result1/2 é o nome da variavel instanciada.
        int number1, number2;
        double result1, result2;

        //nome do tipe de variavel recendo o valor.
        number1 = 14;
        number2 = 19;

        //A variavel recebendo outra com os calc.
        result1 = number1 % 3;
        result2 = number2 % 5;

        //SysOut.
        System.out.println(result1);
        System.out.println(result2);

        /*
        JOptionPane:

        JOptionPane.showMessageDialog(null, result1);
        JOptionPane.showMessageDialog(null, result2);
         */
    }
}