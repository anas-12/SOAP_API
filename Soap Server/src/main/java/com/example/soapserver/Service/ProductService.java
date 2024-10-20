package com.example.soapserver.Service;

import com.example.soapserver.Entity.Product;
import com.example.soapserver.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    public Optional<Product> getProductById(Integer id) {
        return productRepository.findById(id);
    }


    public Product addProduct(Product product) {
        return productRepository.save(product);
    }


    public Product updateProduct(Integer code, Product productDetails) {
        return productRepository.findById(code)
                .map(product -> {
                    product.setName(productDetails.getName());
                    product.setPrice(productDetails.getPrice());
                    product.setDateCreation(productDetails.getDateCreation());
                    product.setQuantity(productDetails.getQuantity());
                    return productRepository.save(product);
                })
                .orElseThrow(() -> new RuntimeException("Produit avec ID " + code + " non trouvé"));
    }

    // Supprimer un produit
    public boolean deleteProduct(Integer code) {
        if (productRepository.existsById(code)) {
            productRepository.deleteById(code);
            return true;
        } else {
            throw new RuntimeException("Produit avec ID " + code + " non trouvé");
        }
    }
}
