package fr.digi.m052024.ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 *
 * @author DIGINAMIC
 */
public class CompteBancaire {

    /**
     * solde : solde du compte
     */
    private double solde;

    /**
     * decouvert : un découvert est autorisé seulement pour les comptes courants
     */
    private double decouvert;


    /**
     * Le type vaut soit CC=Compte courant, ou soit LA=Livret A
     */
    private String type;

    /**
     * Constructeur vide ==> POJO
     */
    public CompteBancaire() {
    }

    /**
     * Constructeur de la classe CompteBancaire
     *
     * @param type
     * @param solde
     * @param decouvert
     */
    public CompteBancaire(String type, double solde, double decouvert) {
        super();
        this.type = type;
        this.solde = solde;
        this.decouvert = decouvert;
    }

    /**
     * Getter pour solde
     *
     * @return le solde du compte bancaire
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter pour solde
     *
     * @param solde Sette le solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Getter pour decouvert
     *
     * @return le decouvert associé au compte
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter pour decouvert
     *
     * @param decouvert Sette le decouvert
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    /**
     * Getter pour type
     *
     * @return le type de compte
     */
    public String getType() {
        return type;
    }

    /**
     * Setter pour type
     *
     * @param type Le type à setter
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant montant à ajouter au solde
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Débite un montant du solde
     *
     * @param montant
     */
    public void debiterMontant(double montant) {
        if (type.equals("CC")) {
            if (this.getSolde() - montant > this.getDecouvert()) {
                this.setSolde(this.getSolde() - montant);
            }
        }
//		else if (type.equals("LA")){
//			if (this.solde - montant > 0){
//				this.solde = this.solde - montant;
//			}
//		}
    }




}
