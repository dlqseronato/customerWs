package br.edu.positivo.scpe.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.edu.positivo.scpe.cs_ws.DeleteCustomerResponse;
import br.edu.positivo.scpe.cs_ws.*;
import br.edu.positivo.scpe.entity.Customer;
import br.edu.positivo.scpe.entity.ICustomerService;




@Endpoint
public class CustomerEndpoint {
	
	private static final String NAMESPACE_URI = "http://scpe.positivo.edu.br/customer-ws";
	
	@Autowired
	private ICustomerService serviceA;	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCustomerByIdRequest")
	@ResponsePayload
	public GetCustomerByIdResponse getCustomer(@RequestPayload GetCustomerByIdRequest request) {
		GetCustomerByIdResponse response = new GetCustomerByIdResponse();
		CustomerInfo customerInfo = new CustomerInfo();
		BeanUtils.copyProperties(serviceA.getCustomerById(request.getId()), customerInfo);
		response.setCustomerInfo(customerInfo);
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCustomerByCpfRequest")
	@ResponsePayload
	public GetCustomerByCpfResponse getCustomer(@RequestPayload GetCustomerByCpfRequest request) {
		GetCustomerByCpfResponse response = new GetCustomerByCpfResponse();
		CustomerInfo customerInfo = new CustomerInfo();
		BeanUtils.copyProperties(serviceA.getCustomerByCpf(request.getCpf()), customerInfo);
		response.setCustomerInfo(customerInfo);
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllCustomersRequest")
	@ResponsePayload
	public GetAllCustomersResponse getAllCustomers() {
		GetAllCustomersResponse response = new GetAllCustomersResponse();
		List<CustomerInfo> customerInfoList = new ArrayList<>();
		List<Customer> customerList = serviceA.getAllCustomers();
		for (int i = 0; i < customerList.size(); i++) {
		     CustomerInfo ob = new CustomerInfo();
		     BeanUtils.copyProperties(customerList.get(i), ob);
		     customerInfoList.add(ob);    
		}
		response.getCustomerInfo().addAll(customerInfoList);
		return response;
	}	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "addCustomerRequest")
	@ResponsePayload
	public AddCustomerResponse addCustomer(@RequestPayload AddCustomerRequest request) {
		AddCustomerResponse response = new AddCustomerResponse();		
    	        ServiceStatus serviceStatus = new ServiceStatus();		
		Customer customer = new Customer();
		customer.setFirstName(request.getFirstName());
		customer.setLastName(request.getFirstName());
		customer.setEmail(request.getEmail());
		customer.setCpf(request.getCpf());
                boolean flag = serviceA.addCustomer(customer);
                if (flag == false) {
        	   serviceStatus.setStatusCode("CONFLICT");
        	   serviceStatus.setMessage("Content Already Available");
        	   response.setServiceStatus(serviceStatus);
                } else {
		   CustomerInfo CustomerInfo = new CustomerInfo();
	           BeanUtils.copyProperties(customer, CustomerInfo);
		   response.setCustomerInfo(CustomerInfo);
        	   serviceStatus.setStatusCode("SUCCESS");
        	   serviceStatus.setMessage("Content Added Successfully");
        	   response.setServiceStatus(serviceStatus);
                }
                return response;
	}
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateCustomerRequest")
	@ResponsePayload
	public UpdateCustomerResponse updateCustomer(@RequestPayload UpdateCustomerRequest request) {
		Customer customer = new Customer();
		BeanUtils.copyProperties(request.getCustomerInfo(), customer);
		serviceA.updateCustomer(customer);
    	        ServiceStatus serviceStatus = new ServiceStatus();
    	        serviceStatus.setStatusCode("SUCCESS");
    	        serviceStatus.setMessage("Content Updated Successfully");
    	        UpdateCustomerResponse response = new UpdateCustomerResponse();
    	        response.setServiceStatus(serviceStatus);
    	        return response;
	}
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteCustomerRequest")
	@ResponsePayload
	public DeleteCustomerResponse deleteCustomer(@RequestPayload DeleteCustomerRequest request) {
		Customer customer = serviceA.getCustomerById(request.getId());
    	        ServiceStatus serviceStatus = new ServiceStatus();
		if (customer == null ) {
	    	    serviceStatus.setStatusCode("FAIL");
	    	    serviceStatus.setMessage("Content Not Available");
		} else {
			serviceA.deleteCustomer(customer);
	    	    serviceStatus.setStatusCode("SUCCESS");
	    	    serviceStatus.setMessage("Content Deleted Successfully");
		}
    	        DeleteCustomerResponse response = new DeleteCustomerResponse();
    	        response.setServiceStatus(serviceStatus);
		return response;
	}	
	
}
