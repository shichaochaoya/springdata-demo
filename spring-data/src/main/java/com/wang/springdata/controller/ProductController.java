package com.wang.springdata.controller;

import com.wang.springdata.model.Product;
import com.wang.springdata.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public @ResponseBody
    String welcome(){
        return "Welcome to Dharma_mall";
    }

    @GetMapping("/product")
    public @ResponseBody
    List<Product> getAllProduct(){
        return productService.getAllPriducts();
    }

    @GetMapping("/product/pname/{pname}")
    Product getProductByPname(@PathVariable String pname){
        return productService.getByName(pname);
    }

    @PostMapping("/product")
    public HttpStatus insertProduct(@PathVariable Product product){
        return productService.addProduct(product)
                ? HttpStatus.CREATED:HttpStatus.BAD_REQUEST;
    }
}
