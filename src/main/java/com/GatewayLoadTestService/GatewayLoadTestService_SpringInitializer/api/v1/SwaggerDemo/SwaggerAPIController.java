package com.GatewayLoadTestService.GatewayLoadTestService_SpringInitializer.api.v1.SwaggerDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerAPIController {
    @RequestMapping(value = "/v1/products", method = RequestMethod.GET)
    public List<String> getProducts() {
        List<String> productsList = new ArrayList<>();
        productsList.add("Honey");
        productsList.add("Almond");
        return productsList;
    }
    @RequestMapping(value = "/v1/products", method = RequestMethod.POST)
    public String createProduct() {
        return "Product is saved successfully";
    }
}
