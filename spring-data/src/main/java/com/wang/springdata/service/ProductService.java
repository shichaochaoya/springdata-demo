package com.wang.springdata.service;

import com.wang.springdata.model.Product;
import com.wang.springdata.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product>getAllPriducts(){
        return (List<Product>)productRepository.findAll();
    }

    public Product getByName(String pname){
        return productRepository.findByPname(pname);
    }

    public boolean addProduct(Product p){
        return productRepository.save(p) !=null;
    }
}
