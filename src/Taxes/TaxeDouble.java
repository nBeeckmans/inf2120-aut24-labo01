package Taxes;

public class TaxeDouble {
    private String nom;
    private double prix;

    public TaxeDouble(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public double prix() {
        return this.prix * 1.09975;
    }

}
