package fr.digi.m052024.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		List<String> types = new ArrayList<String>();
		List<String> noms = new ArrayList<String>();
		List<String> comportements = new ArrayList<String>();

		List<String> typesCarni = new ArrayList<String>();
		List<String> nomsCarni = new ArrayList<String>();
		List<String> comportementsCarni = new ArrayList<String>();

		List<String> typesAqua = new ArrayList<String>();
		List<String> nomsAqua = new ArrayList<String>();
		List<String> comportementsAqua = new ArrayList<String>();

		List<String> typesRep = new ArrayList<String>();
		List<String> nomsRep = new ArrayList<String>();
		List<String> comportementRep = new ArrayList<String>();


		SavaneAfricaine savaneAfricaine = new SavaneAfricaine();

		//String [] T = new String[3];
		//zoo.addAnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
		noms.add("Gazelle");
		types.add("MAMMIFERE");
		comportements.add("HERBIVORE");

		noms.add("Zèbre");
		types.add("MAMMIFERE");
		comportements.add("HERBIVORE");

		savaneAfricaine.setTypes(types);
		savaneAfricaine.setNoms(noms);
		savaneAfricaine.setComportements(comportements);

		//zoo.addAnimal("Zèbre", "MAMIFERE", "HERBIVORE");
		zoo.setSavaneAfricaine(savaneAfricaine);

		ZoneCarnivore zoneCarnivore = new ZoneCarnivore();

		nomsCarni.add("Lion");
		typesCarni.add("MAMMIFERE");
		comportementsCarni.add("CARNIVORE");

		nomsCarni.add("Panthère");
		typesCarni.add("MAMMIFERE");
		comportementsCarni.add("CARNIVORE");

		zoneCarnivore.setNoms(nomsCarni);
		zoneCarnivore.setTypes(typesCarni);
		zoneCarnivore.setComportements(comportementsCarni);

		zoo.setZoneCarnivore(zoneCarnivore);

		//zoo.addAnimal("Lion", "MAMMIFERE", "HERBIVORE");
		//zoo.addAnimal("Panthère", "MAMMIFERE", "CARNIVORE");

		Aquarium aquarium = new Aquarium();

		typesAqua.add("POISSON");
		nomsAqua.add("Requin blanc");
		comportementsAqua.add("HERBIVORE");

		typesAqua.add("POISSON");
		nomsAqua.add("Truite dorée");
		comportementsAqua.add("HERBIVORE");

		aquarium.setTypes(typesAqua);
		aquarium.setNoms(nomsAqua);
		aquarium.setComportements(comportementsAqua);

		zoo.setAquarium(aquarium);

		//zoo.addAnimal("Requin blanc", "POISSON", "HERBIVORE");
		//zoo.addAnimal("Truite dorée", "POISSON", "HERBIVORE");

		FermeReptile reptile = new FermeReptile();

		nomsRep.add("Boa constrictor");
		typesRep.add("REPTILE");
		comportementRep.add("CARNIVORE");

		nomsRep.add("Python");
		typesRep.add("REPTILE");
		comportementRep.add("CARNIVORE");

		reptile.setNoms(nomsRep);
		reptile.setTypes(typesRep);
		reptile.setComportements(comportementRep);

		zoo.setFermeReptile(reptile);

		zoo.afficherListeAnimaux();

		//zoo.addAnimal("Boa constrictor", "REPTILE", "CARNIVORE");
		//zoo.addAnimal("Python", "REPTILE", "CARNIVORE");
	}

}