package br.edu.positivo.scpe.model;

import java.sql.Date;
import java.util.List;

public class Order {
	private int id;
	private Customer customer;
	private Date openDate;
	private Date closeDate;
	private List<OrderItem> orderItens;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void addOrderItem(OrderItem orderItem){
		this.orderItens.add(orderItem);
	}

	public boolean removeOrderItem(OrderItem orderItem){
		return this.orderItens.remove(orderItem);
	}

	public double calculateTotalValue() throws IllegalArgumentException{
		double totalValue = 0;
		for (OrderItem orderItem : orderItens) {
			totalValue += orderItem.getTotalValue();
		}
		if (totalValue > 0) 
			return totalValue;
		else 
			throw new IllegalArgumentException();


	}

	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public Date getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	public List<OrderItem> getOrderItens() {
		return orderItens;
	}
	public void setOrderItens(List<OrderItem> orderItens) {
		this.orderItens = orderItens;
	}


}
