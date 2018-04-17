package br.edu.positivo.scpe.service;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.positivo.scpe.entity.OrderItem;
import br.edu.positivo.scpe.entity.Customer;
import br.edu.positivo.scpe.entity.IOrderItemService;
import br.edu.positivo.scpe.repository.OrderItemRepository;





@Service
public class OrderItemService implements IOrderItemService{

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private OrderItemRepository repository;

	@Override
	public List<OrderItem> getAllOrderItem() {
		List<OrderItem> list = new ArrayList<>();
		repository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public OrderItem getOrderItemCById(long id) {
		OrderItem am = repository.findById(id);
		return am;
	}

	@Override
	public boolean addOrderItemC(OrderItem order) {
		log.debug(String.valueOf(order.getId()));
		order = repository.save(order);
		return true;

	}

	@Override
	public void updateOrderItemC(OrderItem order) {
		repository.save(order);

	}

	@Override
	public void deleteOrderItemC(OrderItem order) {
		repository.delete(order);
	}






}
