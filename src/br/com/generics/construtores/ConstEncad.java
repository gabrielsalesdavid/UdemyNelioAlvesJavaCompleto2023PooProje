package br.com.generics.construtores;

public class ConstEncad {

    public static String name;
    public static double price;
    public static int quantity;

    public static double totalValueInStock() {
        return price * quantity;
    }

    public static double totalValueInSotck() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $"
                + String.format("%.2f", price) + ", "
                + quantity
                + " units, total: $ "
                + String.format("%.2f", totalValueInSotck());
    }
}