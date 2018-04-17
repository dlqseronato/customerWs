package br.edu.positivo.scpe.entity;

import java.util.List;


public interface ICustomerService {
	List<Customer> getAllCustomers();
	Customer getCustomerById(long id);
	Customer getCustomerByCpf(String cpf);
	boolean addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);
}
