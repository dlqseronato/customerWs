package br.edu.positivo.scpe.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product {
	//ID, DESCRIPTION, UNITY_TYPE, UNITY_BUY_VALUE, UNITY_SELL_VALUE, QUANTITY
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@Column(name="DESCRIPTION")
	private String description;
	@Column(name="UNITY_TYPE")
	private String unityType;
	@Column(name="UNITY_SELL_VALUE")
	private double unitySellValue;
	@Column(name="UNITY_BUY_VALUE")
	private double unityBuyValue;
	@Column(name="QUANTITY")
	private long quantity;
	
	
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) throws IllegalArgumentException {
		if(id > 0)
			this.id = id;
		else 
			throw new IllegalArgumentException();
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUnityType() {
		return unityType;
	}
	public void setUnityType(String unityType) {
		this.unityType = unityType;
	}
	public double getUnitySellValue() {
		return unitySellValue;
	}
	public void setUnitySellValue(double unitySellValue) {
		if (unitySellValue > 0) 
			this.unitySellValue = unitySellValue;
		else 
			throw new IllegalArgumentException();
	}
	public double getUnityBuyValue() {
		return unityBuyValue;
	}
	public void setUnityBuyValue(double unityBuyValue) {
		if (unityBuyValue > 0)
			this.unityBuyValue = unityBuyValue;
		else 
			throw new IllegalArgumentException();
	}

}
