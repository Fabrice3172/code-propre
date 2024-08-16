package fr.digi.m052024.ex1;

import java.util.Date;

/**
 * @author fabriceM
 */
public class Entreprise {

    /**
     * siret : Numéro de siret de l'Entreprise :
     */
    public int siret;
    /**
     * nom : Nom de l'Entreprise
     */
    public String nom;
    /**
     * adresse : Adresse de l'Entreprise
     */
    public String adresse;
    /**
     * dateCreation : Date de création de l'Entreprise
     */
    public Date dateCreation;

    /**
     * Capital de l'Entreprise à modifier s'il peut changer ?
     */
    public static final int CAPITAL_MAX = 3000000;

    /**
     * Affichage de l'Entreprise
     */
    @Override
    public String toString() {
        return "Entreprise{" +
                "siret=" + siret +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", dateCreation=" + dateCreation +
                '}';
    }

    /**
     * Affichage du statut de l'Entreprise
     */
    public void afficherStatut() {
        this.toString();
    }

}
