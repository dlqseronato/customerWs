package br.edu.positivo.scpe.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.positivo.scpe.entity.Order;
import br.edu.positivo.scpe.entity.Customer;
import br.edu.positivo.scpe.entity.IOrderService;
import br.edu.positivo.scpe.repository.OrderRepository;





@Service
public class OrderService implements IOrderService{

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private OrderRepository repository;

	@Override
	public List<Order> getAllOrders() {
		List<Order> list = new ArrayList<>();
		repository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public Order getOrderById(long id) {
		Order am = repository.findById(id);
		return am;
	}

	@Override
	@Transactional
	public boolean addOrder(Order order) {
		log.debug(String.valueOf(order.getId()));
		order = repository.save(order);
		return true;

	}

	@Override
	public void updateOrder(Order order) {
		repository.save(order);

	}

	@Override
	public void deleteOrder(Order order) {
		repository.delete(order);
	}

	@Override
	public List<Order> getOrdersByCpf(String cpf) {
		List<Order> orders = repository.findOrderByCpf(cpf);
		return orders;
	}



}
