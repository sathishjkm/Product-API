package com.product.API.product.API.Repository;

import com.product.API.product.API.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);

}
