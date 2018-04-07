package br.edu.positivo.scpe.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.positivo.scpe.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{

}
