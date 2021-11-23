package com.thp.simplecontext.dto;

import java.util.Arrays;

public class AnnouncementDTO {
	
	private Long announceId ;
	private String title;
	private String description  ;
	private int categoryId;
	private double price;
	private byte[] picture;
	private String publicationDate ; 
	private boolean  isAvailable;
	private int viewNumber;
	private String localisation;
	private int userId;
	
	public AnnouncementDTO(Long announceId, String title, String description, int categoryId, double price, byte[] picture,
			String publicationDate, boolean isAvailable, int viewNumber, String localisation, int userId) {
		super();
		this.announceId = announceId;
		this.title = title;
		this.description = description;
		this.categoryId = categoryId;
		this.price = price;
		this.picture = picture;
		this.publicationDate = publicationDate;
		this.isAvailable = isAvailable;
		this.viewNumber = viewNumber;
		this.localisation = localisation;
		this.userId = userId;
	}

	public AnnouncementDTO() {
		super();
	}

	public Long getAnnounceId() {
		return announceId;
	}

	public void setAnnounceId(Long id) {
		this.announceId = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public boolean isIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getViewNumber() {
		return viewNumber;
	}

	public void setViewNumber(int viewNumber) {
		this.viewNumber = viewNumber;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "AnnouncementDTO [announceId=" + announceId + ", title=" + title + ", description=" + description + ", categoryId="
				+ categoryId + ", price=" + price + ", picture=" + Arrays.toString(picture) + ", publicationDate="
				+ publicationDate + ", isAvailable=" + isAvailable + ", viewNumber=" + viewNumber
				+ ", localisation=" + localisation + ", userId=" + userId + "]";
	}

	
}
