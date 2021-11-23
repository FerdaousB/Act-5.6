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
    @Column(name="roleId")
	private Long roleId ;
	
	@Column(name="nom")
	private String nom ;
	
	
	public Role() {
	}


	public Role(Long roleId, String nom) {
		this.roleId = roleId;
		this.nom = nom;
	}


	public Long getRoleId() {
		return roleId;
	}


	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", nom=" + nom + "]";
	}
	
	
	

}
