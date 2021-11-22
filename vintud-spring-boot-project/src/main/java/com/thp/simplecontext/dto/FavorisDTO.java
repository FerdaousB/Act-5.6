package com.thp.simplecontext.dto;

public class FavorisDTO {
	

	private int id;
	private int announcement_id; 
	private int user_id ; 
	private String dateAjout;
	public FavorisDTO(int id, int announcement_id, int user_id, String dateAjout) {
		super();
		this.id = id;
		this.announcement_id = announcement_id;
		this.user_id = user_id;
		this.dateAjout = dateAjout;
	}
	public FavorisDTO() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAnnouncement_id() {
		return announcement_id;
	}
	public void setAnnouncement_id(int announcement_id) {
		this.announcement_id = announcement_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(String dateAjout) {
		this.dateAjout = dateAjout;
	}
	
	

}
