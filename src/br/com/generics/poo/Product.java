package br.com.generics.poo;

public class Product {

    /*
    Atributos estatico com variaveis, String, double e int.
    nomes das variaveis, name, price e quantity.
     */
    public static String name;
    public static double price;
    public static int quantity;

    /*
    Methods estaticos com variaveis double e int com os nomes delas,
    que retorna o nome do atributo realizando o calcurlo.
     */
    public static double totalValueInStock() {
        return price * quantity;
    }

    public void addProdcuts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    /*
    method estatico do tipo Stringo realizando a conversao de double para String.
    que retorna as variaveis double com um String.format indentando a formatacao e o nome do atributo.
     */
    public String toString() {
        return name + ", $"
                + String.format("%.2f", price) + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}