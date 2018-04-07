package br.edu.positivo.scpe.dal;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.edu.positivo.scpe.model.Customer;

@WebService
public class CustomerDAO {
	protected List<Customer> customers = new ArrayList<Customer>();
	protected CustomerResource cr = new CustomerResource();
	@WebMethod
	public void addCustomer(Customer customer){
		cr.postCustomer(customer);
	}
	@WebMethod
	public List<Customer> getCustomers(){
		return (List<Customer>) cr.listaCustomers();
	}
	
	@WebMethod
	public String getAss(){
		return "ASS";
	}
	
	@WebMethod
	public String getPing(String ping){
		return "pong "+ ping;
	}
}
