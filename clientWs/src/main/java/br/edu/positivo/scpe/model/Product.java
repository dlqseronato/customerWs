package br.edu.positivo.scpe.model;

public class Product {
	private int id;
	private String description;
	private String unityType;
	private double unitySellValue;
	private double unityBuyValue;
	public int getId() {
		return id;
	}
	public void setId(int id) throws IllegalArgumentException {
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
