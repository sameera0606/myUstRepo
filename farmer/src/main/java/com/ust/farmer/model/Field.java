package com.ust.farmer.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "field")
public class Field {

	
	private int surveynumber;
	private int acre;
	
	private Set<Crops> crops;
	 
    public Field() {
    }
	

	public Field(int acre) {
		
		this.acre = acre;
	}


	//@Id
   // @Column(name = "surveynumber")
   //@GeneratedValue
	public int getSurveynumber() {
		return surveynumber;
	}

	@OneToMany(mappedBy = "surveynumber", cascade = CascadeType.ALL)
    public Set<Crops> getCrops() {
        return crops;
    }

	public void setSurveynumber(int surveynumber) {
		this.surveynumber = surveynumber;
	}


	public int getAcre() {
		return acre;
	}


	public void setAcre(int acre) {
		this.acre = acre;
	}


	
}
