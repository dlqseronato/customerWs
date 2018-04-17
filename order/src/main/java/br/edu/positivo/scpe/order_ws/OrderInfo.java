//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.16 às 10:33:54 PM BRT 
//


package br.edu.positivo.scpe.order_ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrderInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="openDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="closeDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customer" type="{http://scpe.positivo.edu.br/order-ws}CustomerInfo"/&gt;
 *         &lt;element name="orderItem" type="{http://scpe.positivo.edu.br/order-ws}OrderItemInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInfo", propOrder = {
    "id",
    "openDate",
    "closeDate",
    "customer",
    "orderItem"
})
public class OrderInfo {

    protected long id;
    @XmlElement(required = true)
    protected String openDate;
    @XmlElement(required = true)
    protected String closeDate;
    @XmlElement(required = true)
    protected CustomerInfo customer;
    @XmlElement(required = true)
    protected List<OrderItemInfo> orderItem;

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade openDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
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
     *     {@link String }
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
     *     {@link String }
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
     * Gets the value of the orderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemInfo }
     * 
     * 
     */
    public List<OrderItemInfo> getOrderItem() {
        if (orderItem == null) {
            orderItem = new ArrayList<OrderItemInfo>();
        }
        return this.orderItem;
    }

}
