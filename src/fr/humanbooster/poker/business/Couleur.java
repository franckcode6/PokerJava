package fr.humanbooster.poker.business;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe représente le concept de couleur : coeur, carreau, trèfle et pique
 * @author Franck
 *
 */
public class Couleur {

	//Attributs de la classe
	private Long id;
	private String nom;
	private String symbole;
	private List<Carte> collecton = new ArrayList<>();
	private static Long compteur = 0L;

	//Consctructeurs
	
	//Constructeur par défaut
	public Couleur() {
		this.id = ++compteur;
	}
	
	/**
	 * Constructeur
	 * @param nom
	 */
	public Couleur(String nom) {
		this();
		this.nom = nom;
	}
	
	public Couleur(String nom, String symbole) {
		this(nom);
		this.symbole = symbole;
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSymbole() {
		return symbole;
	}

	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}

	public List<Carte> getCollecton() {
		return collecton;
	}

	public void setCollecton(List<Carte> collecton) {
		this.collecton = collecton;
	}

	@Override
	public String toString() {
		return "Couleur [id=" + id + ", nom=" + nom + "]";
	}

}