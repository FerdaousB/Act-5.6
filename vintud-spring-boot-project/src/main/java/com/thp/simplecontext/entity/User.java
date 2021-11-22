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
        @Column(name="id_user")
		private Long id ;
	    
	    @Column(name="firstname")
	  
		private String firstname ;
	    
	    @Column(name="name")
		private String name ;
	    
	    @Column(name="pseudo")
		private String pseudo  ;
	    
	    @Column(name="mail")
		private String mail ;
	    
	    @Column(name="u_password")
		private String u_password  ;
	    
	    @Column(name="phone")
	    
		private String phone ;
	    
	    @Column(name="address")
		private String address  ;
	    
	    @ManyToOne  
		@JoinColumn( name="id_role" )
		private Role role ;
		
	    
		
		
		
		
		public User() {
		}





		public User(Long id, String firstname, String name, String pseudo, String mail, String u_password, String phone,
				String address, Role role) {
			this.id = id;
			this.firstname = firstname;
			this.name = name;
			this.pseudo = pseudo;
			this.mail = mail;
			this.u_password = u_password;
			this.phone = phone;
			this.address = address;
			this.role=role;
		
		}





		public Long getId() {
			return id;
		}





		public void setId(Long id) {
			this.id = id;
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





		public String getU_password() {
			return u_password;
		}





		public void setU_password(String u_password) {
			this.u_password = u_password;
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
			return "User [id=" + id + ", firstname=" + firstname + ", name=" + name + ", pseudo=" + pseudo + ", mail="
					+ mail + ", u_password=" + u_password + ", phone=" + phone + ", address=" + address + "]";
		}
		
		
		
		
}
