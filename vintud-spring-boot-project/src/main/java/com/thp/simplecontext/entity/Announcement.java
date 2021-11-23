package com.thp.simplecontext.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity //Permet d'indiquer qu'il s'agit d'une classe que l'on souhaite persister
@Table(name="annonce") //Indique le nom de la table dans la base de données
public class Announcement implements  Serializable{

	private static final long serialVersionUID = 1L;

	
	@Id  //Indique qu'il s'agit de la clé primaire
    @GeneratedValue(strategy=GenerationType.AUTO) //Indique comment la clé doit être généré
    @Column(name="announceId")
	private Long annonceId ;
	
	@Column(name="title")
	private String title;
	@Column(name="description")    
	private String description  ;
	
	
	
	@Column(name="price")
	private double price;
	
	@Column(name="picture")
      
	private byte[] picture;
	
	@Column(name="publicationDate")
    
	private String publicationDate ; 
	
	@Column(name="isAvailable")
	private boolean  isAvailable;
	
	@Column(name="viewNumber")
	private int viewNumber;
	
	@Column(name="localisation")
	private String localisation;
	
	@ManyToOne(fetch=FetchType.LAZY) 
	@JoinColumn( name="userId" )
	private User user;
	
	@ManyToOne(fetch=FetchType.LAZY) 
	@JoinColumn( name="categoryId" )
	private Category category;
	
	
	public Announcement() {
	}


	public Announcement(Long annonceId, String title, String description, double price, byte[] picture,
	    String publicationDate, boolean isAvailable, int viewNumber, String localisation, User user,Category category) {
		this.annonceId = annonceId;
		this.title = title;
		this.description = description;
		this.price = price;
		this.picture = picture;
		this.publicationDate = publicationDate;
		this.isAvailable = isAvailable;
		this.viewNumber = viewNumber;
		this.localisation = localisation;
		this.user=user;
		this.category=category;
		
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(picture);
		result = prime * result + Objects.hash(description, annonceId, isAvailable, localisation, price,
				publicationDate, title,  viewNumber);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Announcement other = (Announcement) obj;
		return  Objects.equals(description, other.description) && annonceId == other.annonceId
				&& isAvailable == other.isAvailable && Objects.equals(localisation, other.localisation)
				&& Arrays.equals(picture, other.picture)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(publicationDate, other.publicationDate) && Objects.equals(title, other.title)
			    && viewNumber == other.viewNumber;
	}


	public Long getAnnonceId() {
		return annonceId;
	}


	public void setAnnonceId(Long annonceId) {
		this.annonceId = annonceId;
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


	public double getPrice() {
		return price;
	}


	public void setPrice(double d) {
		this.price = d;
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


	public void setPublicationDate(String string) {
		this.publicationDate = string;
	}


	public boolean getIsAvailable() {
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

	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Announcement [annonceId=" + annonceId + ", title=" + title + ", description=" + description + ", price=" + price + ", picture=" + Arrays.toString(picture) + ", publicationDate="
				+ publicationDate + ", isAvailable=" + isAvailable + ", viewNumber=" + viewNumber
				+ ", localisation=" + localisation + "]";
	}
	
	
	
	
	
	
	
	
}
