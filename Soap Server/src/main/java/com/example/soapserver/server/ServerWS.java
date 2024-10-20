package com.example.soapserver.server;

import com.example.soapserver.webService.ProductWebService;
import jakarta.xml.ws.Endpoint;

public class ServerWS {
    public static void main(String[] args) {
        String url = "http://localhost:8084/ProductWS";
        try {
            Endpoint.publish(url, new ProductWebService());
            System.out.println("Service : " + url);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to publish  service.");
        }
    }
}
