package fr.humanbooster.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.humanbooster.poker.business.Carte;
import fr.humanbooster.poker.business.Couleur;
import fr.humanbooster.poker.business.Joueur;

public class App {

	public static void main(String[] args) {
		// On déclare une collection d'objets de type Couleur
		List<Carte> cartes = creerJeu();
		cartes = melangerCartes(cartes);

		List<Joueur> joueurs = creerJoueur();

		distribuerCartes(cartes, joueurs, 5);
		
		 for (Joueur joueur : joueurs) {
			 System.out.println(joueur);
		 }
	}

	/**
	 * Création des couleurs
	 * 
	 * @return
	 */
	private static List<Carte> creerJeu() {
		List<Couleur> couleurs = new ArrayList<>();
		List<Carte> cartes = new ArrayList<>();

		Couleur couleur1 = new Couleur("Coeur");
		couleurs.add(couleur1);

		Couleur couleur2 = new Couleur("Pique");
		couleurs.add(couleur2);

		Couleur couleur3 = new Couleur("Carreau");
		couleurs.add(couleur3);

		Couleur couleur4 = new Couleur("Trèfle");
		couleurs.add(couleur4);

		// Création des cartes pour chaque couleur
		for (Couleur couleur : couleurs) {
			for (int i = 2; i <= 14; i++) {
				cartes.add(new Carte(i, couleur));
			}
		}
		
		return cartes;
	}

	/**
	 * Création des joueurs
	 * 
	 * @return
	 */
	private static List<Joueur> creerJoueur() {
		List<Joueur> joueurs = new ArrayList<>();
		for (int i = 1; i <= 4; i++) {
			joueurs.add(new Joueur("joueur" + i));
		}
		return joueurs;
	}

	private static List<Carte> melangerCartes(List<Carte> cartes) {
		Collections.shuffle(cartes);
		return cartes;
	}
	
	public static void distribuerCartes(List<Carte> cartes, List<Joueur> joueurs, int nbCartesADistribuer) {
		for (int i = 0; i < nbCartesADistribuer; i++) {
			for (Joueur joueur : joueurs) {
				joueur.getMain().add(cartes.remove(0));
			}
		}
	}
}
