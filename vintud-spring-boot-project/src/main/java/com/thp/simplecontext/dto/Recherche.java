package com.thp.simplecontext.dto;


public class Recherche {

	private int id ;
   	private String type_habit ;
	private String taille ;
	private String couleur ;
	private float fourchette_prix ;
	private User user ;
	
	public Recherche() {
	
	}


	@Override
	public String toString() {
		return "Recherche [id=" + id + ", type_habit=" + type_habit + ", taille=" + taille + ", couleur=" + couleur
				+ ", fourchette_prix=" + fourchette_prix +  "]";
	}


	public Recherche(int id, String type_habit, String taille, String couleur, float fourchette_prix) {
		this.id = id;
		this.type_habit = type_habit;
		this.taille = taille;
		this.couleur = couleur;
		this.fourchette_prix = fourchette_prix;
	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType_habit() {
		return type_habit;
	}


	public void setType_habit(String type_habit) {
		this.type_habit = type_habit;
	}


	public String getTaille() {
		return taille;
	}


	public void setTaille(String taille) {
		this.taille = taille;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public float getFourchette_prix() {
		return fourchette_prix;
	}


	public void setFourchette_prix(float fourchette_prix) {
		this.fourchette_prix = fourchette_prix;
	}


	
	
}
