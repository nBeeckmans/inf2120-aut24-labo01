package Couleurs;

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
        if (rouge < 0) {
            this.rouge = 0;
        } else if (rouge > 255) {
            this.rouge = 255;
        } else {
            this.rouge = rouge;
        }
    }

    public int getVert() {
        return vert;
    }

    public void setVert(int vert) {
        assert vert >= 0 && vert <= 255;
        this.vert = vert;
    }

    public int getBleu() {
        return bleu;
    }

    public void setBleu(int bleu) {
        if (bleu > 255 || bleu < 0) {
            throw new RuntimeException("Pas dans les bornes !"); // runtime exception == pas de throws a mettre !
        }
        this.bleu = bleu;
    }

    @Override
    public String toString() {
        return "Couleurs.Couleur{" +
                "rouge=" + rouge +
                ", vert=" + vert +
                ", bleu=" + bleu +
                '}';
    }

    public void blanchir() {
        this.rouge = (rouge + 255) / 2;
        this.vert = (vert + 255) / 2;
        this.bleu = (bleu + 255) / 2;
    }
}
