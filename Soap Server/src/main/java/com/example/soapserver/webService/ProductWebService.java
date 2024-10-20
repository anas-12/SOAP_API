package com.example.soapserver.webService;

import com.example.soapserver.Entity.Product;
import com.example.soapserver.Service.ProductService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@WebService(serviceName = "ProductWS")
@Component
public class ProductWebService {

    @Autowired
    private ProductService productService;


    @WebMethod
    public Double calculateSellingPrice(@WebParam(name = "productId") Integer productId) {
        Product product = productService.getProductById(productId)
                .orElseThrow(() -> new RuntimeException("Produit avec ID " + productId + " non trouvé"));
        return applyPriceMarkup(product.getPrice(), 1.5);
    }

    // Méthode pour obtenir un produit par son ID
    @WebMethod
    public Product fetchProduct(@WebParam(name = "productId") Integer productId) {
        return productService.getProductById(productId)
                .orElseThrow(() -> new RuntimeException("Produit avec ID " + productId + " non trouvé"));
    }


    @WebMethod
    public List<Product> retrieveAllProducts() {
        List<Product> products = productService.getAllProducts();
        if (products.isEmpty()) {
            throw new RuntimeException("Aucun produit trouvé.");
        }
        return products;
    }


    @WebMethod
    public Product createNewProduct(@WebParam(name = "product") Product product) {
        validateProductDetails(product);
        return productService.addProduct(product);
    }


    @WebMethod
    public Product modifyProduct(@WebParam(name = "productId") Integer productId, @WebParam(name = "updatedProduct") Product updatedProduct) {
        validateProductDetails(updatedProduct);
        return productService.updateProduct(productId, updatedProduct);
    }


    @WebMethod
    public String removeProduct(@WebParam(name = "productId") Integer productId) {
        if (productService.deleteProduct(productId)) {
            return "Produit supprimé avec succès.";
        } else {
            throw new RuntimeException("Produit avec ID " + productId + " non trouvé.");
        }
    }


    private Double applyPriceMarkup(Double basePrice, double markupFactor) {
        return basePrice * markupFactor;
    }


    private void validateProductDetails(Product product) {
        if (product.getName() == null || product.getName().isEmpty()) {
            throw new IllegalArgumentException("Le nom du produit ne peut pas être vide.");
        }
        if (product.getPrice() == null || product.getPrice() <= 0) {
            throw new IllegalArgumentException("Le prix du produit doit être supérieur à zéro.");
        }
        if (product.getQuantity() == null || product.getQuantity() < 0) {
            throw new IllegalArgumentException("La quantité du produit doit être non-négative.");
        }
    }
}
