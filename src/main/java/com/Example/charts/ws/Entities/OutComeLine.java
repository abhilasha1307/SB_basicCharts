package com.Example.charts.ws.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recoveryoutcomeline")
public class OutComeLine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	int Id;
	
	@Column(name="CName")
	String CName;
	
	@Column(name="valuearray")
	String ValueArray;
	
	public OutComeLine() {
		
	}
	
	public OutComeLine(int Id, String CName, String ValueArray) {
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

	public String getDataArray() {
		return ValueArray;
	}

	public void setDataArray(String valueArray) {
		ValueArray = valueArray;
	}

}
