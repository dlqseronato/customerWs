package br.edu.positivo.scpe.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.edu.positivo.scpe.entity.Customer;



public interface CustomerRepository  extends CrudRepository<Customer, Long>{
	Customer findById(long id);
    List<Customer> findCustomersByFirstName(String firstName);
    Customer findCustomerByCpf(String cpf);

}
