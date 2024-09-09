package TaxesLabo;

public class NonTaxable {
    private double prix;
    private String nom;

    public NonTaxable(double prix, String nom) {
        this.prix = prix;
        this.nom = nom;
    }

    public double prix() {
        return this.prix;
    }
}
