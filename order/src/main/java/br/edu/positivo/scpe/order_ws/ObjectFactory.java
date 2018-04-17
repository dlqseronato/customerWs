//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.16 às 10:33:54 PM BRT 
//


package br.edu.positivo.scpe.order_ws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.positivo.scpe.order_ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.positivo.scpe.order_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrderByIdRequest }
     * 
     */
    public GetOrderByIdRequest createGetOrderByIdRequest() {
        return new GetOrderByIdRequest();
    }

    /**
     * Create an instance of {@link GetOrderByIdResponse }
     * 
     */
    public GetOrderByIdResponse createGetOrderByIdResponse() {
        return new GetOrderByIdResponse();
    }

    /**
     * Create an instance of {@link OrderInfo }
     * 
     */
    public OrderInfo createOrderInfo() {
        return new OrderInfo();
    }

    /**
     * Create an instance of {@link GetOrderByCpfRequest }
     * 
     */
    public GetOrderByCpfRequest createGetOrderByCpfRequest() {
        return new GetOrderByCpfRequest();
    }

    /**
     * Create an instance of {@link GetOrderByCpfResponse }
     * 
     */
    public GetOrderByCpfResponse createGetOrderByCpfResponse() {
        return new GetOrderByCpfResponse();
    }

    /**
     * Create an instance of {@link GetAllOrdersRequest }
     * 
     */
    public GetAllOrdersRequest createGetAllOrdersRequest() {
        return new GetAllOrdersRequest();
    }

    /**
     * Create an instance of {@link GetAllOrdersResponse }
     * 
     */
    public GetAllOrdersResponse createGetAllOrdersResponse() {
        return new GetAllOrdersResponse();
    }

    /**
     * Create an instance of {@link AddOrderRequest }
     * 
     */
    public AddOrderRequest createAddOrderRequest() {
        return new AddOrderRequest();
    }

    /**
     * Create an instance of {@link CustomerInfo }
     * 
     */
    public CustomerInfo createCustomerInfo() {
        return new CustomerInfo();
    }

    /**
     * Create an instance of {@link OrderItemInfo }
     * 
     */
    public OrderItemInfo createOrderItemInfo() {
        return new OrderItemInfo();
    }

    /**
     * Create an instance of {@link AddOrderResponse }
     * 
     */
    public AddOrderResponse createAddOrderResponse() {
        return new AddOrderResponse();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

    /**
     * Create an instance of {@link UpdateOrderRequest }
     * 
     */
    public UpdateOrderRequest createUpdateOrderRequest() {
        return new UpdateOrderRequest();
    }

    /**
     * Create an instance of {@link UpdateOrderResponse }
     * 
     */
    public UpdateOrderResponse createUpdateOrderResponse() {
        return new UpdateOrderResponse();
    }

    /**
     * Create an instance of {@link DeleteOrderRequest }
     * 
     */
    public DeleteOrderRequest createDeleteOrderRequest() {
        return new DeleteOrderRequest();
    }

    /**
     * Create an instance of {@link DeleteOrderResponse }
     * 
     */
    public DeleteOrderResponse createDeleteOrderResponse() {
        return new DeleteOrderResponse();
    }

}
