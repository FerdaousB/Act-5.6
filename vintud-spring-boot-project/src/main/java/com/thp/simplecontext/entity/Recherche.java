package com.thp.simplecontext.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="recherche")
public class Recherche implements Serializable{
	
	
	private static final long serialVersionUID = 1L;


		@Id 
        @GeneratedValue(strategy=GenerationType.AUTO) 
        @Column(name="rechercheId")
		private Long rechercheId ;
	    
	    @Column(name="typeHabit")
		private String typeHabit ;
	    
	    @Column(name="taille")
		private String taille ;
	    
	    @Column(name="couleur")
		private String couleur ;
	    
	    @Column(name="fourchettePrix")
		private float fourchettePrix ;
	    
	    @ManyToOne  
		@JoinColumn( name="userId" )
		private User user ;
		
		public Recherche() {
		
		}


		@Override
		public String toString() {
			return "Recherche [rechercheId=" + rechercheId + ", typeHabit=" + typeHabit + ", taille=" + taille + ", couleur=" + couleur
					+ ", fourchettePrix=" + fourchettePrix +  "]";
		}


		public Recherche(Long rechercheId, String typeHabit, String taille, String couleur, float fourchettePrix) {
			this.rechercheId = rechercheId;
			this.typeHabit = typeHabit;
			this.taille = taille;
			this.couleur = couleur;
			this.fourchettePrix = fourchettePrix;
		
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


		
		

}
