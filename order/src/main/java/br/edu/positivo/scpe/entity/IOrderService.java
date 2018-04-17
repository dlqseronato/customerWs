package br.edu.positivo.scpe.entity;

import java.util.List;


public interface IOrderService {
	Order getOrderById(long id);
	List<Order> getOrdersByCpf(String cpf);
	boolean addOrder(Order order);
    void updateOrder(Order order);
    void deleteOrder(Order order);
	List<Order> getAllOrders();

}
