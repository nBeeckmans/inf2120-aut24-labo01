package CouleursLabo;

public class Couleur {
    private int rouge, vert, bleu;

    public Couleur(int rouge, int vert, int bleu) {
        setBleu(bleu);
        setRouge(rouge);
        setVert(vert);
    }

    public int getRouge() {
        return rouge;
    }

    public void setRouge(int rouge) {
        if (rouge < 0 || rouge > 255) {
            throw new RuntimeException("message d'erreur");
        }
        this.rouge = rouge;
    }

    public int getVert() {
        return vert;
    }

    @Override
    public String toString() {
        return "Couleur{" +
                "rouge=" + rouge +
                ", vert=" + vert +
                ", bleu=" + bleu +
                '}';
    }

    public void setVert(int vert) {
        if (vert< 0) {
            this.vert = 0;
        } else if (vert > 255) {
            this.vert = 255;
        } else
            this.vert = vert;
    }

    public int getBleu() {
        return bleu;
    }

    public void setBleu(int bleu) {
        assert bleu > -1 && bleu < 256;
        this.bleu = bleu;
    }

    public void blanchir() {
        this.rouge = (this.rouge + 255 )/ 2;
        this.vert = (this.vert + 255 )/ 2;
        this.bleu = (this.bleu + 255 )/ 2;
    }
}
