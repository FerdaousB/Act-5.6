package com.thp.simplecontext.dto;

public class RoleDTO {
	
	private Long roleId ;
	private String nom ;
	public RoleDTO(Long roleId, String nom) {
		super();
		this.roleId = roleId;
		this.nom = nom;
	}
	public RoleDTO() {
		super();
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
		return "RoleDTO [roleId=" + roleId + ", nom=" + nom + "]";
	}
	
	

}
