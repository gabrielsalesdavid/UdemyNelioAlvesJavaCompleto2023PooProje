package br.com.generics.poo;

public class Triangle {
    /*
    os publics doubles e do tipo de atributo declarada o nome da variavel
    que recebera e transmitira dados a outro atributos.
     */
    public double a;
    public double b;
    public double c;

    public double area() {
        //O nome da variavel p recebe a class com as variaveis realizando os calculos.
        double p;
        p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p -c ));
    }
}