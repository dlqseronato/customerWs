package br.edu.positivo.scpe.entity;

import java.util.List;


public interface IOrderItemService {
	OrderItem getOrderItemCById(long id);
	boolean addOrderItemC(OrderItem order);
	void updateOrderItemC(OrderItem order);
	void deleteOrderItemC(OrderItem order);
	List<OrderItem> getAllOrderItem();

}
