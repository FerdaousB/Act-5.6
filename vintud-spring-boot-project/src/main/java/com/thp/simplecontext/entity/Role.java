package com.thp.simplecontext.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name="role")
public class Role implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id 
    @GeneratedValue(strategy=GenerationType.AUTO) 
    @Column(name="id_role")
	private Long id ;
	
	@Column(name="nom")
	private String nom ;
	
	
	public Role() {
	}


	public Role(Long id, String nom) {
		this.id = id;
		this.nom = nom;
	}


	public Long getId() {
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


	@Override
	public String toString() {
		return "Role [id=" + id + ", nom=" + nom + "]";
	}
	
	
	

}
