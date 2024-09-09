package TaxesLabo;

public class Facture {

    private NonTaxable[] listeNT = new NonTaxable[10];
    int compteurNT;
    private TaxeDouble[] listeTD = new TaxeDouble[10];
    private TaxeSimple[] listeTS = new TaxeSimple[10];

    void ajouterProduitNonTaxable( NonTaxable produit ) {
        assert compteurNT < 10;
        listeNT[compteurNT] = produit;
        compteurNT++;
    }
    void ajouterProduitTaxeSimple( TaxeSimple produit ) {
        int i = 0;
        TaxeSimple temp = listeTS[0];
        while (temp != null) {
            assert i < 10;
            i++;
            temp = listeTS[i];
        }

        listeTS[i] = produit;
    }
    void ajouterProduitTaxeDouble( TaxeDouble produit ) {
        int i = 0;
        for (; i < listeTD.length; i++ ) {
            if (listeTD[i] == null) {
                break;
            }
        }

        listeTD[i] = produit;

    }
    double prixTotal() {
        double prix = 0.0;
        for (int i = 0; i < compteurNT; ++i) {
            prix += listeNT[i].prix();
        }

        for (TaxeDouble temp : listeTD) {
            if (temp != null) prix += temp.prix();
        }

        for (TaxeSimple temp : listeTS) {
            if (temp != null) prix += temp.prix();
            else break;
        }

        return prix;
    }

    public static void main(String[] arg) {
    }
}
