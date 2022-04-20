package fr.humanbooster.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.humanbooster.poker.business.Carte;
import fr.humanbooster.poker.business.Couleur;
import fr.humanbooster.poker.business.Joueur;

public class App {

	public static void main(String[] args) {
		// On crée et mélange le jeu
		List<Carte> cartes = creerJeu();
		cartes = melangerCartes(cartes);

		// On crée les joueurs
		List<Joueur> joueurs = creerJoueur();

		// Distribution des cartes
		distribuerCartes(cartes, joueurs, 5);

		// Affichage de chaque joueurs avec leur jeu respectif
		for (Joueur joueur : joueurs) {
			System.out.println(joueur);
		}
	}

	/**
	 * Création du jeu
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

	/**
	 * Mélanger les cartes
	 * 
	 * @param cartes
	 * @return
	 */
	private static List<Carte> melangerCartes(List<Carte> cartes) {
		Collections.shuffle(cartes);
		return cartes;
	}

	/**
	 * Distribuer les cartes
	 * 
	 * @param cartes
	 * @param joueurs
	 * @param nbCartesADistribuer
	 */
	public static void distribuerCartes(List<Carte> cartes, List<Joueur> joueurs, int nbCartesADistribuer) {
		for (int i = 0; i < nbCartesADistribuer; i++) {
			for (Joueur joueur : joueurs) {
				joueur.getMain().add(cartes.remove(0));
			}
		}
	}
}
