package TaxesLabo;

public class TaxeDouble {
    private double prix;
    private String nom;

    public TaxeDouble(double prix, String nom) {
        this.prix = prix;
        this.nom = nom;
    }

    public double prix() {
        return this.prix * 1.09975;
    }
}
