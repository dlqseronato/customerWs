package br.edu.positivo.scpe.service;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.positivo.scpe.entity.Customer;
import br.edu.positivo.scpe.entity.ICustomerService;
import br.edu.positivo.scpe.repository.CustomerRepository;





@Service
public class CustomerService implements ICustomerService{

	  private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CustomerRepository repository;
	
	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> list = new ArrayList<>();
		repository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public Customer getCustomerById(long id) {
		Customer am = repository.findById(id);
		return am;
	}

	@Override
	public boolean addCustomer(Customer customer) {

		 List<Customer> list = repository.findCustomersByFirstName(customer.getFirstName());
         if (list.size() > 0) {
	           return false;
         } else {
        	 log.debug(String.valueOf(customer.getId()));
	           customer = repository.save(customer);
	           return true;
         }
	}

	@Override
	public void updateCustomer(Customer customer) {
		repository.save(customer);
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		repository.delete(customer);
	}

	@Override
	public Customer getCustomerByCpf(String cpf) {
		Customer am = repository.findCustomerByCpf(cpf);
		return am;
	}


}
