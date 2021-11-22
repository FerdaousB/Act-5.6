package com.thp.simplecontext.dto;

public class RoleDTO {
	
	private int id ;
	private String nom ;
	public RoleDTO(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public RoleDTO() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "RoleDTO [id=" + id + ", nom=" + nom + "]";
	}
	
	

}
