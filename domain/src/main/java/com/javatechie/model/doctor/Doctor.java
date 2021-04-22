package com.javatechie.model.doctor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Doctor {
    @Id
    private int id;
    private String name;
    private String specialist;
    
    public Doctor() {
		// TODO Auto-generated constructor stub
	}
    
    

	public Doctor(int id, String name, String specialist) {
		super();
		this.id = id;
		this.name = name;
		this.specialist = specialist;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
    
    
}
