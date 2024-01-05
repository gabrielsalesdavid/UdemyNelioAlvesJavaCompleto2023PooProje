package br.com.generics.construtores;

public class SobCarg {
    public String name;
    public double price;
    public int quantity;

    /*
    public ConstEncad e um method construtor publico. Sendo instanciado/parametrizado as variaveis String, double e int.
    this seria uma referencia entre objetos/atributos.
    sendo que não usado o this o nome da varaivel se referenciar na instanciacao/parametro do method local.
    por isso se usa o this para referenciar um objeto/atributo.
     */
    public SobCarg(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueInSotck() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, total: $ "
                + String.format("%.2f", totalValueInSotck());
    }
}