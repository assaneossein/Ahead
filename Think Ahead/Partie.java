import java.util.ArrayList;
import java.util.List;

public class Partie {
    private Grille grille;
    private List<joueur> joueurs;
    private List<Coup> coupsJoues;

    public Partie(int tailleGrille, joueur joueur1, joueur joueur2) {
        grille = new Grille(tailleGrille);
        joueurs.add(joueur1);
        joueurs.add(joueur2);
        coupsJoues = new ArrayList<>();
    }

    public Partie(int tailleGrille, JoueurHumain joueur1, JoueurOrdinateur joueur2) {
        //TODO Auto-generated constructor stub
    }

    public void jouerCoup(int ligne, int colonne, Joueur joueur) {
        Case caseSelectionnee = grille.getCase(ligne, colonne);
        Coup coup = new Coup(joueur, caseSelectionnee);
        coupsJoues.add(coup);
        grille.selectionnerCase(caseSelectionnee);
        joueur.incrementerScore(caseSelectionnee.getValeur());
    }

    // Autres méthodes de la classe Partie

    public static void main(String[] args) {
        JoueurHumain joueur1 = new JoueurHumain();
        JoueurOrdinateur joueur2 = new JoueurOrdinateur("Joueur 2");
        Partie partie = new Partie(4, joueur1, joueur2);

        // Boucle de jeu
        while (!partie.estTerminee()) {
            Joueur joueurCourant = partie.getJoueurCourant();

            // Logique pour obtenir le coup joué par le joueurCourant

            int ligne = obtenirligne();
            int colonne = obtenirColonne();

            partie.jouerCoup(ligne, colonne, joueurCourant);
        }

        // Affichage du résultat final
        int scoreJoueur1 = joueur1.getScore();
        int scoreJoueur2 = joueur2.getScore();
        System.out.println("Score Joueur 1 : " + scoreJoueur1);
        System.out.println("Score Joueur 2 : " + scoreJoueur2);
    }

    private boolean estTerminee() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estTerminee'");
    }

    private Joueur getJoueurCourant() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getJoueurCourant'");
    }

    private static int obtenirligne() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenirligne'");
    }

    private static int obtenirColonne() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenirColonne'");
    }
}