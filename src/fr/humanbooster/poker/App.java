package fr.humanbooster.poker;

import java.util.ArrayList;

import fr.humanbooster.poker.business.Carte;
import fr.humanbooster.poker.business.Couleur;

public class App {

	public static void main(String[] args) {
		//On déclare une collection d'objets de type Couleur
		ArrayList<Couleur> couleurs = new ArrayList<>();
		ArrayList<Carte> cartes = new ArrayList<>();
		
		//Création des couleurs
		Couleur couleur1 = new Couleur("Coeur");
		couleurs.add(couleur1);
		
		Couleur couleur2 = new Couleur("Pique");
		couleurs.add(couleur2);
		
		Couleur couleur3 = new Couleur("Carreau");
		couleurs.add(couleur3);
		
		Couleur couleur4 = new Couleur("Trèfle");
		couleurs.add(couleur4);
		
		//Création des cartes pour chaque couleur
		for (Couleur couleur : couleurs) {
			for (int i = 2; i <= 14; i++) {
				cartes.add(new Carte(i, couleur));
			}
		}
		
		System.out.println(cartes);
	}

}
