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
@Table(name="`user`")
public class User implements Serializable {
        
	private static final long serialVersionUID = 1L;

		@Id 
        @GeneratedValue(strategy=GenerationType.AUTO) 
        @Column(name="userId")
		private Long userId ;
	    
	    @Column(name="firstname")
	  
		private String firstname ;
	    
	    @Column(name="name")
		private String name ;
	    
	    @Column(name="pseudo")
		private String pseudo  ;
	    
	    @Column(name="mail")
		private String mail ;
	    
	    @Column(name="userPassword")
		private String userPassword  ;
	    
	    @Column(name="phone")
	    
		private String phone ;
	    
	    @Column(name="address")
		private String address  ;
	    
	    @ManyToOne  
		@JoinColumn( name="roleId" )
		private Role role ;
		
	    
		
		
		
		
		public User() {
		}





		public User(Long userId, String firstname, String name, String pseudo, String mail, String userPassword, String phone,
				String address, Role role) {
			this.userId = userId;
			this.firstname = firstname;
			this.name = name;
			this.pseudo = pseudo;
			this.mail = mail;
			this.userPassword = userPassword;
			this.phone = phone;
			this.address = address;
			this.role=role;
		
		}





		public Long getUserId() {
			return userId;
		}





		public void setUserId(Long userId) {
			this.userId = userId;
		}





		public String getFirstname() {
			return firstname;
		}





		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}





		public String getName() {
			return name;
		}





		public void setName(String name) {
			this.name = name;
		}





		public String getPseudo() {
			return pseudo;
		}





		public void setPseudo(String pseudo) {
			this.pseudo = pseudo;
		}





		public String getMail() {
			return mail;
		}





		public void setMail(String mail) {
			this.mail = mail;
		}





		public String getUserPassword() {
			return userPassword;
		}





		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}





		public String getPhone() {
			return phone;
		}





		public void setPhone(String phone) {
			this.phone = phone;
		}





		public String getAddress() {
			return address;
		}





		public void setAddress(String address) {
			this.address = address;
		}




		@Override
		public String toString() {
			return "User [userId=" + userId + ", firstname=" + firstname + ", name=" + name + ", pseudo=" + pseudo + ", mail="
					+ mail + ", userPassword=" + userPassword + ", phone=" + phone + ", address=" + address + "]";
		}
		
		
		
		
}
