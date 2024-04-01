import java.util.List;

public class AlignementCases {
    private List<Case> cases;
    private int score;

    public AlignementCases(List<Case> cases) {
        this.cases = cases;
        score = calculerScore();
    }

    public List<Case> getCases() {
        return cases;
    }

    public int getScore() {
        return score;
    }

    private int calculerScore() {
        return score;
        // Logique pour calculer le score associé à l'alignement des cases
        // Retourne le score calculé
    }

    // Autres méthodes de la classe AlignementCases
}
