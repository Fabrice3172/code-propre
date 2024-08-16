package fr.digi.m052024.ex2;

public class LivretA extends CompteBancaire {

    /**
     * tauxRemuneration : taux de rémunération dans le cas d'un livret A
     */
    private double tauxRemuneration;

    private static final double DECOUVERT_NUL = 0;
    /**
     * Ce constructeur est utilisé pour créer un compte de type Livret A
     *
     * @param type             = LA
     * @param solde            représente le solde du compte
     * @param decouvert        représente le découvert autorisé
     * @param tauxRemuneration représente le taux de rémunération du livret A
     */
    public LivretA(String type, double solde, double decouvert, double tauxRemuneration) {

        super(type, solde, 0);

        this.tauxRemuneration = tauxRemuneration;

    }

    /**
     * Getter pour tauxRemuneration
     *
     * @return le tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Setter
     *
     * @param tauxRemuneration Sette le taux de rémunération
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }


    /**
     * Ajoute un montant au solde
     * Le Livret A ne peut pas être à découvert, donc comparaison à un découvert nul
     * au lieu du découvert du compte bancaire
     * @param montant
     */
    @Override
    public void debiterMontant(double montant) {
        //super(montant);
        if (super.getType() != null) {
            if (this.getType().equals("LA")) {
                if (this.getSolde() - montant > DECOUVERT_NUL) {
                    this.setSolde(this.getSolde() - montant);
                }
            }
        }
    }

    /**
     * Rémuneration du livret A
     */
    public void appliquerRemuAnnuelle() {
        if (super.getType() != null) {
            if (super.getType().equals("LA")) {
                this.setSolde(this.getSolde() + this.getSolde() * tauxRemuneration / 100);
            }
        }
    }
}
