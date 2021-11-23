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
@Table(name="favoris")
public class Favoris implements Serializable{
	   
	private static final long serialVersionUID = 1L;

		@Id 
        @GeneratedValue(strategy=GenerationType.AUTO) 
        @Column(name="favorisId")
		private Long id;
	    
	    @ManyToOne  
		@JoinColumn( name="announceId" )
		private Announcement announcement; 
	    @ManyToOne  
		@JoinColumn( name="userId" )
		private User user ; 
	    
	    @Column(name="dateAjout")
		private String dateAjout;
		
		
		public Favoris() {
		}


		public Favoris(Long id, String dateAjout) {
			this.id = id;
			this.dateAjout = dateAjout;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getDateAjout() {
			return dateAjout;
		}


		public void setDateAjout(String dateAjout) {
			this.dateAjout = dateAjout;
		}


		@Override
		public String toString() {
			return "Favoris [id=" + id  +  ", dateAjout="
					+ dateAjout + "]";
		}
		
		
		

	}
