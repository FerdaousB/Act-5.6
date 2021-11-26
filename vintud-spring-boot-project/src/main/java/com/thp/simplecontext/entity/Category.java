package com.thp.simplecontext.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="category")
public class Category implements Serializable{

	private static final long serialVersionUID = 1L;


	@Id 
    @GeneratedValue(strategy=GenerationType.AUTO) 
    @Column(name="categoryId")
	private Long categoryId ;
	 
	@Column(name="name")
	private String name  ;
	
	@Column(name="description")
	private String description  ;
	
	
	public Category() {
	}


	public Category(Long categoryId, String name, String description) {
		this.categoryId = categoryId;
		this.name = name;
		this.description = description;
	}


	public Long getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", name=" + name + ", description=" + description + "]";
	}
	
	}
