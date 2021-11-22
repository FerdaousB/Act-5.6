package com.thp.simplecontext.dto;



import com.thp.simplecontext.entity.Role;

public class User {
	
	private int id ;
	private String firstname ;
	private String name ;
	private String pseudo  ;
	private String mail ;
	private String u_password  ;
	private String phone ;
	private String address  ;
	private Role role ;
	
    
	
	
	
	
	public User() {
	}





	public User(int id, String firstname, String name, String pseudo, String mail, String u_password, String phone,
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





	public int getId() {
		return id;
	}





	public void setId(int id) {
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
