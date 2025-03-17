package com.example.product_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import java.util.stream.Collectors;

@RequestMapping("/api")
@RestController
public class ProductController {

    @GetMapping("/products")
    public List<String> getProducts(){
        String[] names = {"Description", "Price", "Stock"};
        List<String> nameslist = Arrays.stream(names)
        .collect(Collectors.toList());
        return nameslist;
    }

}