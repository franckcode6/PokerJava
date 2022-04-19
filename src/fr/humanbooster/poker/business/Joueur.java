package fr.humanbooster.poker.business;

import java.util.*;

public class Joueur {

	private static final float SOLDE_INITIAL = 50f;
	
	private Long id;
	private String pseudo;
	private float solde;
	private List<Carte> main = new ArrayList<>();

	// Variable de classe (commune à tous les objets)
	private static Long compteur = 0L;
	
	//Constructeurs
	public Joueur() {
		id = ++compteur;
		solde = SOLDE_INITIAL;
	}
	
	public Joueur(String pseudo) {
		this();
		this.pseudo = pseudo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public List<Carte> getMain() {
		return main;
	}

	public void setMain(List<Carte> main) {
		this.main = main;
	}

	@Override
	public String toString() {
		return "Joueur [id=" + id + ", pseudo=" + pseudo + ", solde=" + solde + ", main=" + main + "]";
	}
	
}