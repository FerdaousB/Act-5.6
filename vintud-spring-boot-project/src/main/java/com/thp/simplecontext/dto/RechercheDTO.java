package com.thp.simplecontext.dto;

public class RechercheDTO {
	
	private Long rechercheId ;
	private String typeHabit ;
	private String taille ;
	private String couleur ;
	private float fourchettePrix ;
	private int userId ;
	public RechercheDTO(Long rechercheId, String typeHabit, String taille, String couleur, float fourchettePrix, int userId) {
		super();
		this.rechercheId = rechercheId;
		this.typeHabit = typeHabit;
		this.taille = taille;
		this.couleur = couleur;
		this.fourchettePrix = fourchettePrix;
		this.userId = userId;
	}
	public RechercheDTO() {
		super();
	}
	public Long getRechercheId() {
		return rechercheId;
	}
	public void setRechercheId(Long rechercheId) {
		this.rechercheId = rechercheId;
	}
	public String getTypeHabit() {
		return typeHabit;
	}
	public void setTypeHabit(String typeHabit) {
		this.typeHabit = typeHabit;
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
	public float getFourchettePrix() {
		return fourchettePrix;
	}
	public void setFourchettePrix(float fourchettePrix) {
		this.fourchettePrix = fourchettePrix;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
