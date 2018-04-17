//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.16 às 10:33:54 PM BRT 
//


package br.edu.positivo.scpe.order_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrderItemInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderItemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="unityValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemInfo", propOrder = {
    "id",
    "productId",
    "unityValue",
    "quantity"
})
public class OrderItemInfo {

    protected long id;
    protected long productId;
    protected double unityValue;
    protected long quantity;

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
     * Obtém o valor da propriedade productId.
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * Define o valor da propriedade productId.
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
    }

    /**
     * Obtém o valor da propriedade unityValue.
     * 
     */
    public double getUnityValue() {
        return unityValue;
    }

    /**
     * Define o valor da propriedade unityValue.
     * 
     */
    public void setUnityValue(double value) {
        this.unityValue = value;
    }

    /**
     * Obtém o valor da propriedade quantity.
     * 
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * Define o valor da propriedade quantity.
     * 
     */
    public void setQuantity(long value) {
        this.quantity = value;
    }

}
