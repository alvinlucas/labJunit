package labJunit.app;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public double getSolde() {
        return solde;
    }

    public double debiterSolde(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            return montant;
        } else {
            return 0; // Retourne 0 si le montant est invalide ou dépasse le solde
        }
    }

    public double crediterSolde(double montant) {
        if (montant > 0) {
            solde += montant;
            return montant;
        } else {
            return 0; // Retourne 0 si le montant est invalide
        }
    }
}
