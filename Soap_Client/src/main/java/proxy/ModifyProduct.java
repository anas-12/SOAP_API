
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour modifyProduct complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="modifyProduct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="productId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="updatedProduct" type="{http://webService.soapserver.example.com/}product" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyProduct", propOrder = {
    "productId",
    "updatedProduct"
})
public class ModifyProduct {

    protected Integer productId;
    protected Product updatedProduct;

    /**
     * Obtient la valeur de la propriété productId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * Définit la valeur de la propriété productId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductId(Integer value) {
        this.productId = value;
    }

    /**
     * Obtient la valeur de la propriété updatedProduct.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getUpdatedProduct() {
        return updatedProduct;
    }

    /**
     * Définit la valeur de la propriété updatedProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setUpdatedProduct(Product value) {
        this.updatedProduct = value;
    }

}
