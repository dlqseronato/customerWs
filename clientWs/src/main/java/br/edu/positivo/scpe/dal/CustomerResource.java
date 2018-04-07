package br.edu.positivo.scpe.dal;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.positivo.scpe.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerResource {
	@Autowired
	private CustomerRepository repository;
	
	@PostMapping()
	public Customer postCustomer(@RequestBody @Valid Customer Customer) {
		return repository.save(Customer);
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Customer> listaCustomers() {
		Iterable<Customer> listaCustomers = repository.findAll();
		return listaCustomers;
	}
	
	@DeleteMapping()
	public Customer deletaCustomer(@RequestBody Customer Customer) {
		repository.delete(Customer);
		return Customer;
	}
}
