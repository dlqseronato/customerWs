package br.edu.positivo.scpe.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_ITENS")
public class OrderItem {
	//ID, ORDER_ID, PRODUCT_ID, UNITY_VALUE, TOTAL_VALUE, QUANTITY
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@ManyToOne
	private Product product;
	@ManyToOne
	private Order order;
	@Column(name="UNITY_VALUE")
	private double unityValue;
	@Column(name="QUANTITY")
	private long quantity;
	
	

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderItem(long id, Product product, long unityValue, long quantity) throws IllegalArgumentException{
		if(id > 0 && product.getId() > 0 && unityValue > 0 && quantity > 0){
			this.id = id;
			this.product = product;
			this.unityValue = unityValue;
			this.quantity = quantity;
		}else 
			throw new IllegalArgumentException();

	}

	public OrderItem() {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id){
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
	public long getQuantity() {
		if (quantity > 0) 
			return quantity;
		else 
			throw new IllegalArgumentException();


	}
	public void setQuantity(long quantity) throws IllegalArgumentException {
		if( quantity > 0)
			this.quantity = quantity;
		else
			throw new IllegalArgumentException();
	}
	public double getTotalValue() {
		return unityValue * quantity;
	}


}
