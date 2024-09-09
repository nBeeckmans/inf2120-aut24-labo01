package Taxes;

public class NonTaxable {
    private String nom;
    private double prix;

    public NonTaxable(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public double prix() {
        return this.prix;
    }

    // Pour la question des references
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }
}
