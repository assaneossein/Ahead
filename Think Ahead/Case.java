public class Case {
    private int valeur;
    private boolean choisie;

    public Case(int valeur) {
        this.valeur = valeur;
        choisie = false;
    }

    public int getValeur() {
        return valeur;
    }

    public boolean estChoisie() {
        return choisie;
    }

    public void setChoisie(boolean choisie) {
        this.choisie = choisie;
    }
}