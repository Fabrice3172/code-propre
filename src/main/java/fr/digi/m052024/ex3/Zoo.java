package fr.digi.m052024.ex3;
public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
	}

	public Zoo(String nom, SavaneAfricaine savaneAfricaine, ZoneCarnivore zoneCarnivore, FermeReptile fermeReptile, Aquarium aquarium) {
		this.nom = nom;
		this.savaneAfricaine = savaneAfricaine;
		this.zoneCarnivore = zoneCarnivore;
		this.fermeReptile = fermeReptile;
		this.aquarium = aquarium;
	}

	public SavaneAfricaine getSavaneAfricaine() {
		return savaneAfricaine;
	}

	public void setSavaneAfricaine(SavaneAfricaine savaneAfricaine) {
		this.savaneAfricaine = savaneAfricaine;
	}

	public ZoneCarnivore getZoneCarnivore() {
		return zoneCarnivore;
	}

	public void setZoneCarnivore(ZoneCarnivore zoneCarnivore) {
		this.zoneCarnivore = zoneCarnivore;
	}

	public FermeReptile getFermeReptile() {
		return fermeReptile;
	}

	public void setFermeReptile(FermeReptile fermeReptile) {
		this.fermeReptile = fermeReptile;
	}

	public Aquarium getAquarium() {
		return aquarium;
	}

	public void setAquarium(Aquarium aquarium) {
		this.aquarium = aquarium;
	}

	public void addAnimal(String nomAnimal, String typeAnimal, String comportement){
		if (typeAnimal.equals("MAMMIFERE") && comportement.equals("CARNIVORE")){
			if (zoneCarnivore != null) zoneCarnivore.addAnimal(typeAnimal, nomAnimal, comportement);
			else System.out.println("zoneCarnivore est null");
		}
		else if (typeAnimal.equals("MAMMIFERE") && comportement.equals("HERBIVORE")){
			if (savaneAfricaine != null) savaneAfricaine.addAnimal(typeAnimal, nomAnimal, comportement);
			else System.out.println("savaneAfricaine est null");
		}
		else if (typeAnimal.equals("REPTILE")){
			if (fermeReptile != null) fermeReptile.addAnimal(typeAnimal, nomAnimal, comportement);
			else System.out.println("fermeReptile est null");
		}
		else if (typeAnimal.equals("POISSON")){
			if (aquarium != null) aquarium.addAnimal(typeAnimal, nomAnimal, comportement);
			else System.out.println("aquarium est null");
		}

	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}