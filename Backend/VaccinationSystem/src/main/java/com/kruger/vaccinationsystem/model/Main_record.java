//CREO LA TABLA DE REGISTROS PRINCIPALES QUE SOLO EL ADMINISTRADOR MODIFICA
package com.kruger.vaccinationsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Main_record")

public class Main_record {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String identifier;
	private String name;
	private String surname;
	private String mail;
	private String password;
	private String role;

	public Main_record() {
	}
	
	public Main_record(String identifier, String name, String surname, String mail, String password, String role) {
		super();
		this.identifier = identifier;
		this.name = name;
		this.surname = surname;
		this.mail = mail;
		this.password = password;
		this.role = role;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}	
	
	
	
}
