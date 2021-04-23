package com.Example.charts.ws.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "recovery_ajax1") 
public class Entityajax1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	int Id;
	
	@Column(name="CName")
	String CName;

	@Column(name="valuearray")
	String ValueArray;
	
	public Entityajax1() {
		
	}
	
	public Entityajax1(int Id, String CName, String ValueArray) {
		this.Id = Id;
		this.CName = CName;
		this.ValueArray = ValueArray;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}

	public String getCName() {
		return CName;
	}

	public void setCName(String cName) {
		CName = cName;
	}

	public String getValueArray() {
		return ValueArray;
	}

	public void setValueArray(String valueArray) {
		ValueArray = valueArray;
	}


}
