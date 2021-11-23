package com.thp.simplecontext.dto;

public class FavorisDTO {
	

	private Long favorisId;
	private int announcementId; 
	private int userId ; 
	private String dateAjout;
	public FavorisDTO(Long favorisId, int announcementId, int userId, String dateAjout) {
		super();
		this.favorisId = favorisId;
		this.announcementId = announcementId;
		this.userId = userId;
		this.dateAjout = dateAjout;
	}
	public FavorisDTO() {
		super();
	}
	public Long getFavorisId() {
		return favorisId;
	}
	public void setFavorisId(Long favorisId) {
		this.favorisId = favorisId;
	}
	public int getAnnouncementId() {
		return announcementId;
	}
	public void setAnnouncementId(int announcementId) {
		this.announcementId = announcementId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(String dateAjout) {
		this.dateAjout = dateAjout;
	}
	
	

}
