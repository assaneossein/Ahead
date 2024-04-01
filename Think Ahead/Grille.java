

public class Grille {
    private Case[][] cases;

    public Grille(int taille) {
        cases = new Case[taille][taille];
        // Initialisation des cases avec des valeurs aléatoires
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                int valeur = obtenirValeurAleatoire();
                cases[i][j] = new Case(valeur);
            }
        }
    }

    public Case getCase(int ligne, int colonne) {
        return cases[ligne][colonne];
    }

    public void selectionnerCase(Case caseSelectionnee) {
        // Parcourir les cases de la grille et marquer la case sélectionnée comme déjà choisie
        for (int i = 0; i < cases.length; i++) {
            for (int j = 0; j < cases.length; j++) {
                if (cases[i][j] == caseSelectionnee) {
                    cases[i][j].setChoisie(true);
                }
            }
        }
    }

    public boolean estCaseChoisie(int ligne, int colonne) {
        return cases[ligne][colonne].estChoisie();
    }

    // Autres méthodes de la classe Grille

    private int obtenirValeurAleatoire() {
        return 0;
        // Logique pour obtenir une valeur aléatoire pour une case de la grille
        // Retourne la valeur générée aléatoirement
    }
}