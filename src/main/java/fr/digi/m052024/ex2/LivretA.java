package fr.digi.m052024.ex2;

public class LivretA extends CompteBancaire {

    public LivretA(String type, double solde, double tauxRemuneration) {

        super(type, solde, 0, tauxRemuneration);


    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    @Override
    public void debiterMontant(double montant) {
        //super(montant);
        if (this.getType().equals("LA")) {
            if (this.getSolde() - montant > 0) {
                this.setSolde(this.getSolde() - montant);
            }
        }
    }
}
