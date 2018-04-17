package br.edu.positivo.scpe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.positivo.scpe.entity.Customer;
import br.edu.positivo.scpe.entity.Order;



public interface OrderRepository  extends CrudRepository<Order, Long>{
	Order findById(long id);
	@Query("select o from Order o left join o.customer c where c.cpf = ?1")
	List<Order> findOrderByCpf(String cpf);
}
