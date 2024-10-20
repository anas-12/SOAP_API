
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _Product_QNAME = new QName("http://webService.soapserver.example.com/", "Product");
    private static final QName _CalculateSellingPrice_QNAME = new QName("http://webService.soapserver.example.com/", "calculateSellingPrice");
    private static final QName _CalculateSellingPriceResponse_QNAME = new QName("http://webService.soapserver.example.com/", "calculateSellingPriceResponse");
    private static final QName _CreateNewProduct_QNAME = new QName("http://webService.soapserver.example.com/", "createNewProduct");
    private static final QName _CreateNewProductResponse_QNAME = new QName("http://webService.soapserver.example.com/", "createNewProductResponse");
    private static final QName _FetchProduct_QNAME = new QName("http://webService.soapserver.example.com/", "fetchProduct");
    private static final QName _FetchProductResponse_QNAME = new QName("http://webService.soapserver.example.com/", "fetchProductResponse");
    private static final QName _ModifyProduct_QNAME = new QName("http://webService.soapserver.example.com/", "modifyProduct");
    private static final QName _ModifyProductResponse_QNAME = new QName("http://webService.soapserver.example.com/", "modifyProductResponse");
    private static final QName _RemoveProduct_QNAME = new QName("http://webService.soapserver.example.com/", "removeProduct");
    private static final QName _RemoveProductResponse_QNAME = new QName("http://webService.soapserver.example.com/", "removeProductResponse");
    private static final QName _RetrieveAllProducts_QNAME = new QName("http://webService.soapserver.example.com/", "retrieveAllProducts");
    private static final QName _RetrieveAllProductsResponse_QNAME = new QName("http://webService.soapserver.example.com/", "retrieveAllProductsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     * @return
     *     the new instance of {@link Product }
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link CalculateSellingPrice }
     * 
     * @return
     *     the new instance of {@link CalculateSellingPrice }
     */
    public CalculateSellingPrice createCalculateSellingPrice() {
        return new CalculateSellingPrice();
    }

    /**
     * Create an instance of {@link CalculateSellingPriceResponse }
     * 
     * @return
     *     the new instance of {@link CalculateSellingPriceResponse }
     */
    public CalculateSellingPriceResponse createCalculateSellingPriceResponse() {
        return new CalculateSellingPriceResponse();
    }

    /**
     * Create an instance of {@link CreateNewProduct }
     * 
     * @return
     *     the new instance of {@link CreateNewProduct }
     */
    public CreateNewProduct createCreateNewProduct() {
        return new CreateNewProduct();
    }

    /**
     * Create an instance of {@link CreateNewProductResponse }
     * 
     * @return
     *     the new instance of {@link CreateNewProductResponse }
     */
    public CreateNewProductResponse createCreateNewProductResponse() {
        return new CreateNewProductResponse();
    }

    /**
     * Create an instance of {@link FetchProduct }
     * 
     * @return
     *     the new instance of {@link FetchProduct }
     */
    public FetchProduct createFetchProduct() {
        return new FetchProduct();
    }

    /**
     * Create an instance of {@link FetchProductResponse }
     * 
     * @return
     *     the new instance of {@link FetchProductResponse }
     */
    public FetchProductResponse createFetchProductResponse() {
        return new FetchProductResponse();
    }

    /**
     * Create an instance of {@link ModifyProduct }
     * 
     * @return
     *     the new instance of {@link ModifyProduct }
     */
    public ModifyProduct createModifyProduct() {
        return new ModifyProduct();
    }

    /**
     * Create an instance of {@link ModifyProductResponse }
     * 
     * @return
     *     the new instance of {@link ModifyProductResponse }
     */
    public ModifyProductResponse createModifyProductResponse() {
        return new ModifyProductResponse();
    }

    /**
     * Create an instance of {@link RemoveProduct }
     * 
     * @return
     *     the new instance of {@link RemoveProduct }
     */
    public RemoveProduct createRemoveProduct() {
        return new RemoveProduct();
    }

    /**
     * Create an instance of {@link RemoveProductResponse }
     * 
     * @return
     *     the new instance of {@link RemoveProductResponse }
     */
    public RemoveProductResponse createRemoveProductResponse() {
        return new RemoveProductResponse();
    }

    /**
     * Create an instance of {@link RetrieveAllProducts }
     * 
     * @return
     *     the new instance of {@link RetrieveAllProducts }
     */
    public RetrieveAllProducts createRetrieveAllProducts() {
        return new RetrieveAllProducts();
    }

    /**
     * Create an instance of {@link RetrieveAllProductsResponse }
     * 
     * @return
     *     the new instance of {@link RetrieveAllProductsResponse }
     */
    public RetrieveAllProductsResponse createRetrieveAllProductsResponse() {
        return new RetrieveAllProductsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.soapserver.example.com/", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateSellingPrice }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateSellingPrice }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.soapserver.example.com/", name = "calculateSellingPrice")
    public JAXBElement<CalculateSellingPrice> createCalculateSellingPrice(CalculateSellingPrice value) {
        return new JAXBElement<>(_CalculateSellingPrice_QNAME, CalculateSellingPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateSellingPriceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateSellingPriceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.soapserver.example.com/", name = "calculateSellingPriceResponse")
    public JAXBElement<CalculateSellingPriceResponse> createCalculateSellingPriceResponse(CalculateSellingPriceResponse value) {
        return new JAXBElement<>(_CalculateSellingPriceResponse_QNAME, CalculateSellingPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateNewProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.soapserver.example.com/", name = "createNewProduct")
    public JAXBElement<CreateNewProduct> createCreateNewProduct(CreateNewProduct value) {
        return new JAXBElement<>(_CreateNewProduct_QNAME, CreateNewProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateNewProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.soapserver.example.com/", name = "createNewProductResponse")
    public JAXBElement<CreateNewProductResponse> createCreateNewProductResponse(CreateNewProductResponse value) {
        return new JAXBElement<>(_CreateNewProductResponse_QNAME, CreateNewProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FetchProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.soapserver.example.com/", name = "fetchProduct")
    public JAXBElement<FetchProduct> createFetchProduct(FetchProduct value) {
        return new JAXBElement<>(_FetchProduct_QNAME, FetchProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FetchProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.soapserver.example.com/", name = "fetchProductResponse")
    public JAXBElement<FetchProductResponse> createFetchProductResponse(FetchProductResponse value) {
        return new JAXBElement<>(_FetchProductResponse_QNAME, FetchProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModifyProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.soapserver.example.com/", name = "modifyProduct")
    public JAXBElement<ModifyProduct> createModifyProduct(ModifyProduct value) {
        return new JAXBElement<>(_ModifyProduct_QNAME, ModifyProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModifyProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.soapserver.example.com/", name = "modifyProductResponse")
    public JAXBElement<ModifyProductResponse> createModifyProductResponse(ModifyProductResponse value) {
        return new JAXBElement<>(_ModifyProductResponse_QNAME, ModifyProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.soapserver.example.com/", name = "removeProduct")
    public JAXBElement<RemoveProduct> createRemoveProduct(RemoveProduct value) {
        return new JAXBElement<>(_RemoveProduct_QNAME, RemoveProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.soapserver.example.com/", name = "removeProductResponse")
    public JAXBElement<RemoveProductResponse> createRemoveProductResponse(RemoveProductResponse value) {
        return new JAXBElement<>(_RemoveProductResponse_QNAME, RemoveProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveAllProducts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveAllProducts }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.soapserver.example.com/", name = "retrieveAllProducts")
    public JAXBElement<RetrieveAllProducts> createRetrieveAllProducts(RetrieveAllProducts value) {
        return new JAXBElement<>(_RetrieveAllProducts_QNAME, RetrieveAllProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveAllProductsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveAllProductsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.soapserver.example.com/", name = "retrieveAllProductsResponse")
    public JAXBElement<RetrieveAllProductsResponse> createRetrieveAllProductsResponse(RetrieveAllProductsResponse value) {
        return new JAXBElement<>(_RetrieveAllProductsResponse_QNAME, RetrieveAllProductsResponse.class, null, value);
    }

}
