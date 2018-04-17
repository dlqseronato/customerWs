//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.16 às 10:33:54 PM BRT 
//


package br.edu.positivo.scpe.order_ws;

import java.sql.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="closeDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="customer" type="{http://scpe.positivo.edu.br/order-ws}CustomerInfo"/&gt;
 *         &lt;element name="orderItem" type="{http://scpe.positivo.edu.br/order-ws}OrderItemInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "openDate",
    "closeDate",
    "customer",
    "orderItem"
})
@XmlRootElement(name = "addOrderRequest")
public class AddOrderRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected String openDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected String closeDate;
    @XmlElement(required = true)
    protected CustomerInfo customer;
    @XmlElement(required = true)
    protected  List<OrderItemInfo> orderItem;

    /**
     * Obtém o valor da propriedade openDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getOpenDate() {
        return openDate;
    }

    /**
     * Define o valor da propriedade openDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenDate(String value) {
        this.openDate = value;
    }

    /**
     * Obtém o valor da propriedade closeDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getCloseDate() {
        return closeDate;
    }

    /**
     * Define o valor da propriedade closeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseDate(String value) {
        this.closeDate = value;
    }

    /**
     * Obtém o valor da propriedade customer.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo }
     *     
     */
    public CustomerInfo getCustomer() {
        return customer;
    }

    /**
     * Define o valor da propriedade customer.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo }
     *     
     */
    public void setCustomer(CustomerInfo value) {
        this.customer = value;
    }

    /**
     * Obtém o valor da propriedade orderItem.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemInfo }
     *     
     */
    public List<OrderItemInfo> getOrderItem() {
        return orderItem;
    }

    /**
     * Define o valor da propriedade orderItem.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemInfo }
     *     
     */
    public void setOrderItem( List<OrderItemInfo> value) {
        this.orderItem = value;
    }

}
