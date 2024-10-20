package com.example.soap_client.client;

import proxy.Product;
import proxy.ProductWS;
import proxy.ProductWebService;


import java.util.List;

public class ClientWS {

    public static void main(String[] args) {
        
        ProductWebService serviceProxy = new ProductWS().getProductWebServicePort();


        Integer idProduit = 1;
        double prixVente = serviceProxy.calculateSellingPrice(idProduit);
        System.out.println("Prix de vente du produit avec ID " + idProduit + " : " + prixVente);


        Product produit = serviceProxy.fetchProduct(idProduit);
        afficherInfosProduit(produit);


        Product nouveauProduit = creerProduit("Pain", 5.0, 20);
        serviceProxy.createNewProduct(nouveauProduit);


        Integer idPain = 2;
        System.out.println("Prix de vente du produit 'Pain' : " + serviceProxy.calculateSellingPrice(idPain));


        List<Product> listeProduits = serviceProxy.retrieveAllProducts();
        listeProduits.forEach(ClientWS::afficherInfosProduit);
    }


    private static void afficherInfosProduit(Product produit) {
        if (produit != null) {
            System.out.println("Détails du produit : ");
            System.out.println("Nom : " + produit.getName());
            System.out.println("Prix : " + produit.getPrice());
            System.out.println("Quantité : " + produit.getQuantity());
            System.out.println("----------------------------");
        } else {
            System.out.println("Produit introuvable.");
        }
    }


    private static Product creerProduit(String nom, double prix, int quantite) {
        Product produit = new Product();
        produit.setName(nom);
        produit.setPrice(prix);
        produit.setQuantity(quantite);
        return produit;
    }
}
