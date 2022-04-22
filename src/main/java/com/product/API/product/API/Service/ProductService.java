package com.product.API.product.API.Service;

import com.product.API.product.API.Entity.Product;
import com.product.API.product.API.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product){
        return productRepository.save(product);
    }
    public List<Product>addProducts(List<Product> products){
        return productRepository.saveAll(products);
    }
    public List<Product>getProductAll(){
        return productRepository.findAll();
    }
    public Product getProductById(Integer id){
        return productRepository.findById(id).orElse(null);
    }
    public Product getProductByName(String name){
        return productRepository.findByName(name);
    }
    public Product updateProductById(Product product,Integer id){
        product.setId(id);
        return productRepository.save(product);
    }
    public void deleteProductById(Integer id){
        productRepository.deleteById(id);
    }
}
