package fr.humanbooster.poker.business;


public class Carte {

	// Attribut(s)
	// Qu'est ce qui d�finit une carte?
	private int valeur;
	private String nom;
	private Couleur couleur;

	// Constructeur(s)
	// plusieurs consctructeurs sont disponibles: surchage de constructeur
	// (overload)
	public Carte() {

	}

	/**
	 * Cette m�thode est un constructeur qui prend un param�tre la valeur de la
	 * carte � cr�er puis la couleur associ�e
	 * 
	 * @param valeur
	 * @param couleur
	 */
	public Carte(int valeur, Couleur couleur) {
		// this.valeur permet de faire ref�rence � l'attribut valeur
		this.valeur = valeur;
		this.couleur = couleur;
		switch (valeur) {
		case 11:
			nom = "Valet";
			break;
		case 12:
			nom = "Dame";
			break;
		case 13:
			nom = "Roi";
			break;
		case 14:
			nom = "As";
			break;
		default:
			nom = String.valueOf(valeur);
			break;
		}
	}

	/**
	 * Accesseur pour r�cup�rer la valeur de l'objet carte
	 * 
	 * @return
	 */
	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return nom + " de " + couleur.getNom();
	}

}