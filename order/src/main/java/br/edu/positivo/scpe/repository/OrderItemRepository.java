package br.edu.positivo.scpe.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.edu.positivo.scpe.entity.Customer;
import br.edu.positivo.scpe.entity.OrderItem;



public interface OrderItemRepository  extends CrudRepository<OrderItem, Long>{
	OrderItem findById(long id);
}
