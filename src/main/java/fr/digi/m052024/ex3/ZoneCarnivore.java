package fr.digi.m052024.ex3;
import java.util.ArrayList;
import java.util.List;

public class ZoneCarnivore {

	private List<String> types;
	private List<String> noms;
	private List<String> comportements;

	public ZoneCarnivore() {
	}

	public ZoneCarnivore(List<String> types, List<String> noms, List<String> comportements) {
		this.types = types;
		this.noms = noms;
		this.comportements = comportements;
	}

	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public List<String> getNoms() {
		return noms;
	}

	public void setNoms(List<String> noms) {
		this.noms = noms;
	}

	public List<String> getComportements() {
		return comportements;
	}

	public void setComportements(List<String> comportements) {
		this.comportements = comportements;
	}

	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		//types.add(typeAnimal);
		List<String> l = new ArrayList<String>();
		l.add(typeAnimal);
		l.addAll(getTypes());
		setTypes(l);

		//noms.add(nomAnimal);
		List<String> lnAni = new ArrayList<String>();
		lnAni.add(nomAnimal);
		lnAni.addAll(getNoms());
		setNoms(lnAni);

		//comportements.add(comportement);
		List<String> lComp = new ArrayList<String>();
		lComp.add(comportement);
		lComp.addAll(getComportements());
		setComportements(lComp);



		//noms.add(nomAnimal);
		//comportements.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.print(nom + "   ");
		}

		for (String type: types) {
			System.out.print(type + "   ");
		}

		for (String comp: comportements) {
			System.out.print(comp + "   ");
		}

		System.out.println();
	}
	
	public double calculerKgsNourritureParJour(){
		return noms.size() * 10;
	}
}