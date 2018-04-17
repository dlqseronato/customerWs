package br.edu.positivo.scpe.endpoint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


import br.edu.positivo.scpe.order_ws.*;
import br.edu.positivo.scpe.entity.Order;
import br.edu.positivo.scpe.entity.OrderItem;
import br.edu.positivo.scpe.entity.Customer;
import br.edu.positivo.scpe.entity.IOrderService;

@Endpoint
public class OrderEndpoint {
	
	private static final String NAMESPACE_URI = "http://scpe.positivo.edu.br/order-ws";
	
	@Autowired
	private IOrderService serviceA;	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getOrderByIdRequest")
	@ResponsePayload
	public GetOrderByIdResponse getOrder(@RequestPayload GetOrderByIdRequest request) {
		GetOrderByIdResponse response = new GetOrderByIdResponse();
		OrderInfo orderInfo = new OrderInfo();
		BeanUtils.copyProperties(serviceA.getOrderById(request.getId()), orderInfo);
		response.setOrderInfo(orderInfo);
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getOrderByCpfRequest")
	@ResponsePayload
	public GetOrderByCpfResponse getOrder(@RequestPayload GetOrderByCpfRequest request) {
		GetOrderByCpfResponse response = new GetOrderByCpfResponse();
		OrderInfo orderInfo = new OrderInfo();
		BeanUtils.copyProperties(serviceA.getOrdersByCpf(request.getCpf()), orderInfo);
		response.setOrderInfo(orderInfo);
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllOrdersRequest")
	@ResponsePayload
	public GetAllOrdersResponse getAllOrders() {
		GetAllOrdersResponse response = new GetAllOrdersResponse();
		List<OrderInfo> orderInfoList = new ArrayList<>();
		List<Order> orderList = serviceA.getAllOrders();
		for (int i = 0; i < orderList.size(); i++) {
		     OrderInfo ob = new OrderInfo();
		     BeanUtils.copyProperties(orderList.get(i), ob);
		     orderInfoList.add(ob);    
		}
		response.getOrderInfo().addAll(orderInfoList);
		return response;
	}	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "addOrderRequest")
	@ResponsePayload
	public AddOrderResponse addOrder(@RequestPayload AddOrderRequest request) {
		AddOrderResponse response = new AddOrderResponse();		
    	        ServiceStatus serviceStatus = new ServiceStatus();		
		Order order = new Order();
		Customer customer = new Customer();

		List<OrderItem> orderList = new ArrayList<OrderItem>();
		BeanUtils.copyProperties(request.getCustomer(),customer);
		order.setCustomer(customer);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			order.setOpenDate(sdf.parse(request.getOpenDate()));
			order.setCloseDate(sdf.parse(request.getCloseDate()));
		} catch (ParseException e) {
			System.out.println("BAUM");
		}

		for ( OrderItemInfo orderItemInfo : request.getOrderItem()) {
		     OrderItem ob = new OrderItem();
		     BeanUtils.copyProperties(orderItemInfo, ob);
		     orderList.add(ob);    
		}
		order.setOrderItens(orderList);
                boolean flag = serviceA.addOrder(order);
                if (flag == false) {
        	   serviceStatus.setStatusCode("CONFLICT");
        	   serviceStatus.setMessage("Content Already Available");
        	   response.setServiceStatus(serviceStatus);
                } else {
		   OrderInfo OrderInfo = new OrderInfo();
	           BeanUtils.copyProperties(order, OrderInfo);
		   response.setOrderInfo(OrderInfo);
        	   serviceStatus.setStatusCode("SUCCESS");
        	   serviceStatus.setMessage("Content Added Successfully");
        	   response.setServiceStatus(serviceStatus);
                }
                return response;
	}
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateOrderRequest")
	@ResponsePayload
	public UpdateOrderResponse updateOrder(@RequestPayload UpdateOrderRequest request) {
		Order order = new Order();
		BeanUtils.copyProperties(request.getOrderInfo(), order);
		serviceA.updateOrder(order);
    	        ServiceStatus serviceStatus = new ServiceStatus();
    	        serviceStatus.setStatusCode("SUCCESS");
    	        serviceStatus.setMessage("Content Updated Successfully");
    	        UpdateOrderResponse response = new UpdateOrderResponse();
    	        response.setServiceStatus(serviceStatus);
    	        return response;
	}
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteOrderRequest")
	@ResponsePayload
	public DeleteOrderResponse deleteOrder(@RequestPayload DeleteOrderRequest request) {
		Order order = serviceA.getOrderById(request.getId());
    	        ServiceStatus serviceStatus = new ServiceStatus();
		if (order == null ) {
	    	    serviceStatus.setStatusCode("FAIL");
	    	    serviceStatus.setMessage("Content Not Available");
		} else {
			serviceA.deleteOrder(order);
	    	    serviceStatus.setStatusCode("SUCCESS");
	    	    serviceStatus.setMessage("Content Deleted Successfully");
		}
    	        DeleteOrderResponse response = new DeleteOrderResponse();
    	        response.setServiceStatus(serviceStatus);
		return response;
	}	
	
}
