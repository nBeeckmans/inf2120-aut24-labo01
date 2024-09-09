package Taxes;

public class Principale {

    public static void main(String[] args) {
        Facture facture = new Facture();

        NonTaxable externe =
                new NonTaxable("quelque chose", 1);

        facture.ajouterProduitNonTaxable(externe);
        facture.ajouterProduitTaxeDouble(new TaxeDouble("jsp", 12));
        facture.ajouterProduitTaxeSimple(new TaxeSimple("un produit", 10));

        System.out.println(facture.prixTotal());

        System.out.println(externe);

    }
}
