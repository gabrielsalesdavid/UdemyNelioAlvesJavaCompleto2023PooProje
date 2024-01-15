package br.com.generics.encapsulamento;

public class Encapsu {

    /*
    Encapsulamento seria a forma de passar um atributo para private.
    Sendo assim o atributo nao e acessivel para qualquer class.
     */
    private String name;
    private double price;
    private int quantity;

    public Encapsu() {
    }

    /*
    public Encapsu e um method construtor publico. Sendo instanciado/parametrizado as variaveis String, double e int.
    this seria uma referencia entre objetos/atributos.
    sendo que não usado o this o nome da varaivel se referenciar na instanciacao/parametro do method local.
    por isso se usa o this para referenciar um objeto/atributo.
    Usasse um method public com a variavel setObject/Variavel. Serve para coletar os dados e altera.
    getObject/Variavel e como joga o dado alterado! o get/set e usado para ser usado para entrada e saida de dados.
    por regra de negocio não se usa o set para somente a saida de dados e nao pela entrada!
    Passando na class principal ele com o valor para ser alterado.
     */
    public Encapsu(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
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
        return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, total: $ " + String.format("%.2f", totalValueInSotck());
    }
}