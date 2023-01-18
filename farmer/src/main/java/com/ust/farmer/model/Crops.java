package com.ust.farmer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "crops")
public class Crops {

@Id
	private int id;
	private String cropname;
	private int surveynumber;
	
	private Field field;
	
	public Crops() {
    }

	public Crops(String cropname, int surveynumber) {
		super();
		this.cropname = cropname;
		this.surveynumber = surveynumber;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne
    @JoinColumn(name = "surveynumber")
    public Field getField() {
        return field;
    }
 
	
	
	public String getCropname() {
		return cropname;
	}

	public void setCropname(String cropname) {
		this.cropname = cropname;
	}

	public int getSurveynumber() {
		return surveynumber;
	}

	public void setSurveynumber(int surveynumber) {
		this.surveynumber = surveynumber;
	}
	
	
}
