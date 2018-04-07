package br.edu.positivo.scpe.model;

public class OrderItem {
	private int id;
	private Product product;
	private double unityValue;
	private int quantity;

	public OrderItem(int id, Product product, int unityValue, int quantity) throws IllegalArgumentException{
		if(id > 0 && product.getId() > 0 && unityValue > 0 && quantity > 0){
			this.id = id;
			this.product = product;
			this.unityValue = unityValue;
			this.quantity = quantity;
		}else 
			throw new IllegalArgumentException();

	}

	public int getId() {
		return id;
	}
	public void setId(int id){
		if (id >= 0) 
			this.id = id;
		else 
			throw new IllegalArgumentException();

	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getUnityValue() {
		return unityValue;
	}
	public void setUnityValue(double unityValue) {
		if (unityValue > 0) 
			this.unityValue = unityValue;
		else 
			throw new IllegalArgumentException();


	}
	public int getQuantity() {
		if (quantity > 0) 
			return quantity;
		else 
			throw new IllegalArgumentException();


	}
	public void setQuantity(int quantity) throws IllegalArgumentException {
		if( quantity > 0)
			this.quantity = quantity;
		else
			throw new IllegalArgumentException();
	}
	public double getTotalValue() {
		return unityValue * quantity;
	}


}
