package Taxes;

public class TaxeSimple {
    private String nom;
    private double prix;

    public TaxeSimple(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public double prix() {
        return this.prix * 1.05;
    }
}
