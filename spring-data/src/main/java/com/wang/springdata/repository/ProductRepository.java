package com.wang.springdata.repository;

import com.wang.springdata.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByPname(String pname);

}
