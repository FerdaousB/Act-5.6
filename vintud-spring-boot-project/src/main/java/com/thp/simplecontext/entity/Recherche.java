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
        @Column(name="id_recherche")
		private Long id ;
	    
	    @Column(name="type_habit")
		private String type_habit ;
	    
	    @Column(name="taille")
		private String taille ;
	    
	    @Column(name="couleur")
		private String couleur ;
	    
	    @Column(name="fourchette_prix")
		private float fourchette_prix ;
	    
	    @ManyToOne  
		@JoinColumn( name="id_user" )
		private User user ;
		
		public Recherche() {
		
		}


		@Override
		public String toString() {
			return "Recherche [id=" + id + ", type_habit=" + type_habit + ", taille=" + taille + ", couleur=" + couleur
					+ ", fourchette_prix=" + fourchette_prix +  "]";
		}


		public Recherche(Long id, String type_habit, String taille, String couleur, float fourchette_prix) {
			this.id = id;
			this.type_habit = type_habit;
			this.taille = taille;
			this.couleur = couleur;
			this.fourchette_prix = fourchette_prix;
		
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
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
