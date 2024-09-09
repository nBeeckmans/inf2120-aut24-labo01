package Taxes;

public class Facture {
    private NonTaxable[] listeNonTaxables = new NonTaxable[10];
    private TaxeSimple[] listeTaxeSimple = new TaxeSimple[10];
    private TaxeDouble[] listeTaxeDouble = new TaxeDouble[10];


    // On maintient le nombre d'elements dans des variables.
    int totalNT, totalTS, totalTD;

    void ajouterProduitNonTaxable( NonTaxable produit ) {
        assert totalNT < 10;
        produit.setNom(produit.getNom() + "NT");
        listeNonTaxables[totalNT] = produit;
        totalNT++;
    }
    void ajouterProduitTaxeSimple( TaxeSimple produit ) {
        assert totalTS < 10;
        listeTaxeSimple[totalTS] = produit;
        totalTS++;
    }
    void ajouterProduitTaxeDouble( TaxeDouble produit ) {
        assert totalTD < 10;
        listeTaxeDouble[totalTD] = produit;
        totalTD++;
    }
    double prixTotal() {
        double total = 0.0;
        for (NonTaxable nonTaxable : listeNonTaxables) {
            if (nonTaxable == null) continue;
            total += nonTaxable.prix();
        }

        for (int i = 0; i < totalTS; ++i) {
           total += listeTaxeSimple[i].prix();
        }

        for (int i = 0; i < totalTD; i++) {
            total += listeTaxeDouble[i].prix();
        }

        return total;
    }

}
