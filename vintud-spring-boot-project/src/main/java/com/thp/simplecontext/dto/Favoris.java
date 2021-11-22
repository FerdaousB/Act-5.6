package com.thp.simplecontext.dto;


public class Favoris {
	private int id;
	private Announcement announcement; 
	private User user ; 
	private String dateAjout;
	
	
	public Favoris() {
	}


	public Favoris(int id, String dateAjout) {
		this.id = id;
		this.dateAjout = dateAjout;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
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
