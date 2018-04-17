package br.edu.positivo.scpe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Phone {
	
	@Id
	private int id;
	
	@Column(name="DDD")
	private int ddd;
	
	@Column(name="NUMBER")
	private long number;
	
	
	/*
	public Phone(int id, int ddd, int number) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.number = number;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	
	
}
