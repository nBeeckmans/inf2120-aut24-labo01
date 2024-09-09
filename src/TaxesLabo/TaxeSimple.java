package TaxesLabo;

public class TaxeSimple {
    private double prix;
    private String nom;

    public TaxeSimple(double prix, String nom) {
        this.prix = prix;
        this.nom = nom;
    }

    public double prix() {
        return this.prix * 1.05;
    }
}
