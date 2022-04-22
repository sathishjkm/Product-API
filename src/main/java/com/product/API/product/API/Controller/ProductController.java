package com.product.API.product.API.Controller;

import com.product.API.product.API.Entity.Product;
import com.product.API.product.API.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/post")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @PostMapping("/postAll")
    public List<Product>addProducts(@RequestBody List<Product> products){
        return productService.addProducts(products);
    }
    @GetMapping("/get")
    public List<Product> getProductAll(){
        return productService.getProductAll();
    }
    @GetMapping("/getById/{id}")
    public Product getProductById(@PathVariable ("id") Integer id){
        return productService.getProductById(id);
    }
    @GetMapping("/getByName/{name}")
    public Product getProductByName(@PathVariable("name") String name) {
        return productService.getProductByName(name);
    }
    @PutMapping("/putById/{id}")
    public Product updateProductById(@RequestBody Product product,@PathVariable("id") Integer id){
        return productService.updateProductById(product,id);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteProductById(@PathVariable("id") Integer id){
        productService.deleteProductById(id);
    }
}
