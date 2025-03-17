package com.example.customer_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import java.util.stream.Collectors;
import org.springframework.web.client.RestTemplate;



@RequestMapping("/api")
@RestController
public class CustomerController {

    RestTemplate rest;
    @GetMapping("/Customers")
    public List<String> getProducts(){
        String[] names = {"Email", "Phone", "Address"};
        List<String> nameslist = Arrays.stream(names)
        .collect(Collectors.toList());
        return nameslist;
    }
    @SuppressWarnings("unchecked")
    @GetMapping("/products")
    public List<String> getUserData()
    {
        rest = new RestTemplate();
        return rest.getForObject("http://localhost:5555/api/products", List.class);
    }

}
