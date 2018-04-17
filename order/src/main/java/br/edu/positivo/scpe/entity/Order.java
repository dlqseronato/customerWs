package br.edu.positivo.scpe.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import br.edu.positivo.scpe.order_ws.CustomerInfo;

@Entity
@Table(name="ORDER_C")
public class Order {
	
	//ID, CUSTOMER_ID, ORDER_OPENED_DATE, ORDER_CLOSED_DATE
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	@ManyToOne
	private Customer customer;
	@Column(name="ORDER_OPENED_DATE")
	private Date openDate;
	@Column(name="ORDER_CLOSED_DATE")
	private Date closeDate;
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
	private List<OrderItem> orderItens;

	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public void setOpenDate(Date date) {
		this.openDate = date;
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
