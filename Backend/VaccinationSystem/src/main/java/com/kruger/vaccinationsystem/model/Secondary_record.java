//CREO LA TABLA DE REGISTROS SECUNDARIOS QUE EL USUARIO MODIFICA 
package com.kruger.vaccinationsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="secondary_record")

public class Secondary_record {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String date;
	private String location;
	private boolean v_state;
	private String v_type;
	
	
	public Secondary_record() {
		
	}
	
	public Secondary_record(String date, String location, boolean v_state, String v_type) {
		super();
		this.date = date;
		this.location = location;
		this.v_state = v_state;
		this.v_type = v_type;
	}

		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isV_state() {
		return v_state;
	}

	public void setV_state(boolean v_state) {
		this.v_state = v_state;
	}

	public String getV_type() {
		return v_type;
	}

	public void setV_type(String v_type) {
		this.v_type = v_type;
	}
	
	
	
}
