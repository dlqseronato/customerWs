package br.edu.positivo.scpe.model;

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
	private int number;
	
	
	
	public Phone(int id, int ddd, int number) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.number = number;
	}
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
}
